package com.springtutorial;

import java.util.*;

public class JavaCollections {
	private List addressList;
	private Set addressSet;
	private Map addressMap;
	private Properties addressProp;
	
	public List getAddressList() {
		System.out.println("Address List : " + addressList);
		return addressList;
	}
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	public Set getAddressSet() {
		System.out.println("Address set : " + addressSet);
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public Map getAddressMap() {
		System.out.println("Address map : " + addressMap);
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	public Properties getAddressProp() {
		System.out.println("Address properties : "+ addressProp);
		return addressProp;
	}
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

}
