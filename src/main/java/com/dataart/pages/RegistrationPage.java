package com.dataart.pages;

import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At("http://acc.icpc.org.ua/auth/signup")

public class RegistrationPage extends PageObject {

public String getPageTitle() {
		
		System.out.println(this.getTitle());
		return this.getTitle();
	}

}
