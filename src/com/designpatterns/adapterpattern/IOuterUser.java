package com.designpatterns.adapterpattern;

import java.util.Map;

@SuppressWarnings("all")
public interface IOuterUser {
	
	public Map getUserBaseInfo();
	
	public Map getUserOfficeInfo();
	
	public Map getUserHomeInfo();
}
