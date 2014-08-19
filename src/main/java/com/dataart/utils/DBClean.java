package com.dataart.utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class DBClean {


public static void deleteEmailFromDB(String param) {
	String urlParameters = param;
	String request = "http://acc.icpc.org.ua/test/user/delete/";
	URL url =null;
	try {
		url = new URL(request + "?"+ urlParameters);
	} catch (MalformedURLException e) {
	
		e.printStackTrace();
	} 
	try {
	HttpURLConnection connection = (HttpURLConnection) url.openConnection(); 
	connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");	 
	connection.setRequestMethod("DELETE");
	System.out.println("Response code: " + connection.getResponseCode());
	} catch (IOException exception){
		 exception.printStackTrace();
	} 
	
	
	
}
}
