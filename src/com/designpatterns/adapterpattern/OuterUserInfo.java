package com.designpatterns.adapterpattern;

import java.util.Map;

@SuppressWarnings("all")
public class OuterUserInfo extends OuterUser implements IUserInfo {

	private Map baseInfo = super.getUserBaseInfo(); //Ա���Ļ�����Ϣ
	private Map homeInfo = super.getUserHomeInfo(); //Ա���ļ�ͥ��Ϣ
	private Map officeInfo = super.getUserOfficeInfo(); //������Ϣ
	
	@Override
	public String getUserName() {
		String userName = (String)this.baseInfo.get("userName");
		System.out.println(userName);
		return userName;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress = (String)this.homeInfo.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getMobileTelNumber() {
		String mobileNumber = (String)this.baseInfo.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber = (String)this.officeInfo.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}

	@Override
	public String getJobPosition() {
		String jobPosition = (String)this.officeInfo.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}

	@Override
	public String getHomeTelNumber() {
		String homeTelNumber = (String)this.homeInfo.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

}
