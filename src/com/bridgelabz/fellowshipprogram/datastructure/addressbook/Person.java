package com.bridgelabz.fellowshipprogram.oops.addressbook;

public class Person {
String lname;
String fname;
Address addobj;
long phoneNumber;
public Person(String lname, String fname, Address addobj, long phoneNumber) {
	
	this.lname = lname;
	this.fname = fname;
	this.addobj = addobj;
	this.phoneNumber = phoneNumber;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public Address getAddobj() {
	return addobj;
}
public void setAddobj(Address addobj) {
	this.addobj = addobj;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
}
