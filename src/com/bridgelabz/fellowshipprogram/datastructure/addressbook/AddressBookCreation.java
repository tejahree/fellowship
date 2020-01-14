package com.bridgelabz.fellowshipprogram.oops.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookCreation {
public static void main(String[] args) {
	System.out.println("-----Wel-come for addresss book creation-----\n");
	System.out.println("Enter the name of address book\n");
	Scanner scanner = new Scanner(System.in);
	int id=scanner.nextInt();
	String name=scanner.next();
	Address add;
	ArrayList<AddressBook> list= new ArrayList<AddressBook>();
	ArrayList<Person> listOfPerson= new ArrayList<Person>();
	list.add(new AddressBook(id, name));
	AddressBookList listOfAddress= new AddressBookList();
	listOfAddress.setListOfAddress(list);
	Map<Integer, ArrayList<Person>> map= new HashMap<Integer, ArrayList<Person>>();
	map.put(id, listOfPerson);

	System.out.println("-----AddressBook option-------");
	System.out.println("1.Add person\n");
	System.out.println("2.Edit person Detail\n");
	System.out.println("3.Print by sortedLastName\n");
	System.out.println("4.Print by SortedZip\n");
	System.out.println("5.Delet Person\n");
	System.out.println("6.Close Address Book\n");
	System.out.println("Enter Option\n");
	int option=scanner.nextInt();
	switch(option) {
	case 1: System.out.println("Welcome to Added person\n");
			System.out.println("Enter firstName\n");
			String pname=scanner.next();
			System.out.println("Enter LastName\n");
			String plname=scanner.next();
			System.out.println("Enter city\n");
			String city=scanner.next();
			System.out.println("Enter zip\n");
			int zip=scanner.nextInt();
			System.out.println("Enter state\n");
			String state=scanner.next();
			System.out.println("Enter phoneNumber\n");
			long phoneNumber=scanner.nextLong();
			listOfPerson.add(new Person(pname, plname, new Address(city, state, zip), phoneNumber));
			System.out.println("person records is sussfully add\n");
		break;
	case 2: System.out.println("Welcom to Edit");
			boolean found=false;
			System.out.println("Enter FirstName \n");
			String fnameToSearch= scanner.next();
			System.out.println("Enter LastName\n");
			String lnameToSearch=scanner.next();
			for(int i=0;i<listOfPerson.size();i++){
				if((fnameToSearch==(listOfPerson.get(i).getFname())) &&(lnameToSearch==(listOfPerson.get(i).getLname()))) {
					found=true;
					System.out.println("----editOption-----\n");
					System.out.println("1.to edit city\n");
					System.out.println("2.to edit state\n");
					System.out.println("3.to edit zip\n");
					System.out.println("4.to edit phone number\n");
					System.out.println("5.exit\n");
					System.out.println("enter option\n");
					int optionEdit= scanner.nextInt();
					while(option!=5) {
					switch(optionEdit) {
					case 1:System.out.println("Enter edited info for city\n");
							String newCity=scanner.next();
							listOfPerson.get(i).getAddobj().setCity(newCity);
							System.out.println("City is SuccessFully Edited\n");
						break;
					case 2:System.out.println("Enter edited info for state\n");
							String newState=scanner.next();
							listOfPerson.get(i).getAddobj().setState(newState);
							System.out.println("State is SuccessFully Edited\n");
						break;
					case 3:System.out.println("Enter edited info for zip\n");
							int newZip=scanner.nextInt();
							listOfPerson.get(i).getAddobj().setZip(newZip);
							System.out.println("zip is SuccessFully Edited\n");
						break;
					case 4:System.out.println("Enter edited info for phoneNumber\n");
							long newPhone=scanner.nextLong();
							listOfPerson.get(i).setPhoneNumber(newPhone);
							System.out.println("Phone number  is SuccessFully Edited\n");
						break;
					case 5:System.out.println("thanku for using edited option\n");
						break;
					default:System.out.println("Please Enter Validate option\n");
						break;
					}
					}
				}
			}
			if(found==false)
				System.out.println("enter firstName and lastname is not present\n");
		break;
	case 3:	System.out.println("Welcome to sortBy LastName\n");
			ArrayList<Person> sortedListByName=new ArrayList<Person>();
			String[] lnamearray=new String[listOfPerson.size()];
			for(int i=0;i<listOfPerson.size();i++) {
				lnamearray[i]=listOfPerson.get(i).getLname();
			}
			lnamearray=Utility.bubblesortForStringArray(lnamearray);
			for(int i=0;i<lnamearray.length;i++) {
				for(int j=0;j<listOfPerson.size();j++) {
					if((listOfPerson.get(j).getLname()).equals(lnamearray[i])) {
						sortedListByName.add(listOfPerson.get(j));
					}
				}
			}
			//sortedList
			
		break;
	case 4:	System.out.println("Welcome to sortBy Zip\n");
			ArrayList<Person> sortedListByZip=new ArrayList<Person>();
			int[] ziparray= new int[listOfPerson.size()];
			for(int i=0;i<listOfPerson.size();i++) {
				ziparray[i]=listOfPerson.get(i).getAddobj().getZip();
			}
			ziparray=Utility.bubblesort(ziparray);
			for(int i=0;i<ziparray.length;i++) {
				for(int j=0;j<listOfPerson.size();j++) {
					if((listOfPerson.get(j).getAddobj().getZip())==ziparray[i]) {
						sortedListByZip.add(listOfPerson.get(j));
					}
				}
			}
	//sortedlist;
		break;
	case 5:System.out.println("Welcome to DeletePerson\n");
			boolean foundRecords=false;
	 		System.out.println("Enter FirstName\n");
	 		String deletfName=scanner.next();
	 		System.out.println("Enter lastName\n");
	 		String deletlname=scanner.next();
	 		for(int i=0;i<listOfPerson.size();i++) {
	 			if( ((listOfPerson.get(i).getFname()).equals(deletfName))  && ((listOfPerson.get(i).getLname()).equals(deletlname)) ) {
	 				foundRecords=true;
	 				listOfPerson.remove(i);
	 			}
	 		}
	 		if(foundRecords==false) {
	 			System.out.println("Enter firstName And lastName is not present\n");
	 		}else {
	 			System.out.println("person Records is Successfully deleted\n");
	 		}
	 	break;
	case 6:System.out.println("So AddressBookID:"+id+"AddressBookName:"+name+"is been Closed\n");
		break;
	default:System.out.println("please enter validate option\n");
		break;
	}
	
}
}
