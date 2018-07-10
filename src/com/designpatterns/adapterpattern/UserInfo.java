package com.designpatterns.adapterpattern;

public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		System.out.println("Name is ....");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("HomeAddress is ....");
		return null;
	}

	@Override
	public String getMobileTelNumber() {
		System.out.println("MobileTelNumber is ....");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("OfficeTelNumber is ....");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("JobPosititon is ....");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("HomeTelNumber is ....");
		return null;
	}

}
