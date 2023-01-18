package com.seshagiri.util;

public enum CategoryEnum {
	
		
	Electronic("Electronic"),
	Mobiles("Mobiles"),
	HomeDecor("HomeDecor"),
	Bicycles("Bicycles"),
	Toys("Toys");
	
	CategoryEnum(String value) {
		this.value = value;
	}
	
	
	public String getValue() {
		return this.value;
	}
	
     public String value;
}
