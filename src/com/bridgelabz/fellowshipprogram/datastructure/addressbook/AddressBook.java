package com.bridgelabz.fellowshipprogram.oops.addressbook;

public class AddressBook {
	int IdOfAddressBook;
String NameOfAddressBook;

public AddressBook(int idOfAddressBook, String nameOfAddressBook) {
	
	IdOfAddressBook = idOfAddressBook;
	NameOfAddressBook = nameOfAddressBook;
}
public int getIdOfAddressBook() {
	return IdOfAddressBook;
}
public void setIdOfAddressBook(int idOfAddressBook) {
	IdOfAddressBook = idOfAddressBook;
}
public String getNameOfAddressBook() {
	return NameOfAddressBook;
}
public void setNameOfAddressBook(String nameOfAddressBook) {
	NameOfAddressBook = nameOfAddressBook;
}

}
