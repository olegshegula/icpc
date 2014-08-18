package com.dataart.utils;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.InternetAddress;

public class CheckGmail {
	public static String checkEMailAndGetConfirmationLink(String email,
			String password) {

		String confirmURL = null;
		Properties properties = System.getProperties();
		properties.setProperty("mail.store.protocol", "imaps");
		properties.setProperty("mail.imaps.partialfetch", "false");
		try {
			Session session = Session.getDefaultInstance(properties, null);
			Store store = session.getStore("imaps");// create store instance
			store.connect("imap.gmail.com", email, password);//
			// store.connect(Vars.GMAIL_URL, email, password);
			// System.out.println(store);
			Folder inbox = store.getFolder("inbox");
			inbox.open(Folder.READ_WRITE);// set access type of Inbox
			Message messages[] = inbox.getMessages();// gets inbox messages
			if (messages.length == 0) {
				System.out.println("There is no message!");
				return null;
			}

			for (Message message : messages) {
				//System.out.println(message.getSubject().toString());
				//System.out.println(InternetAddress.toString(message.getFrom()));
				if (message.getSubject().toString()
						.equals("ICPC Email confirmation")
						&& InternetAddress.toString(message.getFrom())
								.contains(Vars.ICPC_EMAIL)) {
					
					Pattern link_pattern = Pattern.compile("http://.*");

					Object content = message.getContent();
					Multipart mp = (Multipart) content;

					BodyPart bp = mp.getBodyPart(0);
					Matcher matcher = link_pattern.matcher((String) bp
							.getContent());

					if (matcher.find()) {
						System.out.println(matcher.group(0));
						confirmURL = matcher.group(0);

					}
					message.setFlag(Flags.Flag.DELETED, true);
				}
			}
			store.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return confirmURL;
	}

}
