package com.bridgelabz.fellowshipprogram.oops.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookManager {
	
static	Scanner scanner=new Scanner(System.in);

public ArrayList<Person> createNewBook(ArrayList<Person> listOfPersons) {
	
	
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
	listOfPersons.add(new Person(pname, plname, new Address(city, state, zip), phoneNumber));
	System.out.println("person records is sussfully add\n");
	return listOfPersons;
	}
	

public ArrayList<Person> editNewbook(ArrayList<Person> listOfPersons){
	boolean found=false;
	System.out.println("Enter FirstName \n");
	String fnameToSearch= scanner.next();
	System.out.println("Enter LastName\n");
	String lnameToSearch=scanner.next();
	for(int i=0;i<listOfPersons.size();i++){
		if((fnameToSearch==(listOfPersons.get(i).getFname())) &&(lnameToSearch==(listOfPersons.get(i).getLname()))) {
			found=true;
			System.out.println("----editOption-----\n");
			System.out.println("1.to edit city\n");
			System.out.println("2.to edit state\n");
			System.out.println("3.to edit zip\n");
			System.out.println("4.to edit phone number\n");
			System.out.println("5.exit\n");
			System.out.println("enter option\n");
			int optionEdit= scanner.nextInt();
			while(optionEdit!=5) {
			switch(optionEdit) {
			case 1:System.out.println("Enter edited info for city\n");
					String newCity=scanner.next();
					listOfPersons.get(i).getAddobj().setCity(newCity);
					System.out.println("City is SuccessFully Edited\n");
				break;
			case 2:System.out.println("Enter edited info for state\n");
					String newState=scanner.next();
					listOfPersons.get(i).getAddobj().setState(newState);
					System.out.println("State is SuccessFully Edited\n");
				break;
			case 3:System.out.println("Enter edited info for zip\n");
					int newZip=scanner.nextInt();
					listOfPersons.get(i).getAddobj().setZip(newZip);
					System.out.println("zip is SuccessFully Edited\n");
				break;
			case 4:System.out.println("Enter edited info for phoneNumber\n");
					long newPhone=scanner.nextLong();
					listOfPersons.get(i).setPhoneNumber(newPhone);
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
	
	return listOfPersons;
}

public ArrayList<Person> sortByName(ArrayList<Person> listOfPersons){
	ArrayList<Person> sortedListByName=new ArrayList<Person>();
	String[] lnamearray=new String[listOfPersons.size()];
	for(int i=0;i<listOfPersons.size();i++) {
		lnamearray[i]=listOfPersons.get(i).getLname();
	}
	lnamearray=Utility.bubblesortForStringArray(lnamearray);
	for(int i=0;i<lnamearray.length;i++) {
		for(int j=0;j<listOfPersons.size();j++) {
			if((listOfPersons.get(j).getLname()).equals(lnamearray[i])) {
				sortedListByName.add(listOfPersons.get(j));
			}
		}
	}
	return sortedListByName;
}

public ArrayList<Person> sortByZip(ArrayList<Person> listOfPersons){
	ArrayList<Person> sortedListByZip=new ArrayList<Person>();
	int[] ziparray= new int[listOfPersons.size()];
	for(int i=0;i<listOfPersons.size();i++) {
		ziparray[i]=listOfPersons.get(i).getAddobj().getZip();
	}
	ziparray=Utility.bubblesort(ziparray);
	for(int i=0;i<ziparray.length;i++) {
		for(int j=0;j<listOfPersons.size();j++) {
			if((listOfPersons.get(j).getAddobj().getZip())==ziparray[i]) {
				sortedListByZip.add(listOfPersons.get(j));
			}
		}
	}
	return sortedListByZip;
}

public ArrayList<Person> deletePerson(ArrayList<Person> listOfPersons){
	boolean foundRecords=false;
		System.out.println("Enter FirstName\n");
		String deletfName=scanner.next();
		System.out.println("Enter lastName\n");
		String deletlname=scanner.next();
		for(int i=0;i<listOfPersons.size();i++) {
			if( ((listOfPersons.get(i).getFname()).equals(deletfName))  && ((listOfPersons.get(i).getLname()).equals(deletlname)) ) {
				foundRecords=true;
				listOfPersons.remove(i);
			}
		}
		if(foundRecords==false) {
			System.out.println("Enter firstName And lastName is not present\n");
		}else {
			System.out.println("person Records is Successfully deleted\n");
		}
		return listOfPersons;
}




public static void main(String[] args) {
	AddressBookManager manager= new AddressBookManager();
	Map<Integer, ArrayList<Person>> map= new HashMap<Integer, ArrayList<Person>>();
	System.out.println("-----------Welcome to AddressLibrary----------\n");
	System.out.println("-------Option for ListOfAddress------\n");
	System.out.println("1.Create New AddressBook\n");
	System.out.println("2.Open AddressBook\n");
	System.out.println("3.Save AddressBook\n");
	System.out.println("4.Save As AddressBook\n");
	System.out.println("5.Close AddressBookLibrary\n");
	
	System.out.println("Enter Option\n");
	int option=scanner.nextInt();
	while(option!=5) {
	switch(option) {
	case 1:	System.out.println("-----Wel-come for addresss book creation-----\n");
			System.out.println("Enter the name of address book\n");
	
			int id=scanner.nextInt();
			String name=scanner.next();
			Address add;
			ArrayList<AddressBook> list= new ArrayList<AddressBook>();
			ArrayList<Person> listOfPersons= new ArrayList<Person>();
			list.add(new AddressBook(id, name));
			AddressBookList listOfAddress= new AddressBookList();
			listOfAddress.setListOfAddress(list);
			
			map.put(id, listOfPersons);

			System.out.println("-----AddressBook option-------");
			System.out.println("1.Add person\n");
			System.out.println("2.Edit person Detail\n");
			System.out.println("3.Print by sortedLastName\n");
			System.out.println("4.Print by SortedZip\n");
			System.out.println("5.Delet Person\n");
			System.out.println("6.Close Address Book\n");
			System.out.println("Enter Option\n");
			int optionnew =scanner.nextInt();
			switch(optionnew) {
			case 1:System.out.println("Welcome to Added person\n");
					listOfPersons=manager.createNewBook(listOfPersons);
					break;
			case 2:System.out.println("Welcom to Edit");
					listOfPersons=manager.editNewbook(listOfPersons);
					break;
			case 3:System.out.println("Welcome to sortBy LastName\n");
					manager.sortByName(listOfPersons);
					/*take sorted list and then edit into json file*/ 
					break;
			case 4: System.out.println("Welcome to sortBy Zip\n");
					manager.sortByZip(listOfPersons);
					/*take sorted list and then edit into json file*/ 
					break;
			case 5:System.out.println("Welcome to DeletePerson\n");
					listOfPersons=manager.deletePerson(listOfPersons);
					break;
			case 6:System.out.println("So AddressBookID:"+id+"AddressBookName:"+name+"is been Closed\n");
				break;
			default:System.out.println("please enter validate option\n");
				break;
			}
		break;
	case 2: System.out.println("-----Wel-come for addresss book opening-----\n");
			System.out.println("Enter the AddressBook id to open\n");
			int bookid=scanner.nextInt();
			ArrayList<Person> listInMap;
			if(map.containsKey(bookid))
			{
				listInMap=map.get(bookid);
				System.out.println("-----AddressBook option-------");
				System.out.println("1.Add person\n");
				System.out.println("2.Edit person Detail\n");
				System.out.println("3.Print by sortedLastName\n");
				System.out.println("4.Print by SortedZip\n");
				System.out.println("5.Delet Person\n");
				System.out.println("6.Close Address Book\n");
				System.out.println("Enter Option\n");
				int optionopen =scanner.nextInt();
				switch(optionopen) {
				case 1:System.out.println("Welcome to Added person\n");
						listOfPersons=manager.createNewBook(listInMap);
						break;
				case 2:System.out.println("Welcom to Edit");
						listOfPersons=manager.editNewbook(listInMap);
						break;
				case 3:System.out.println("Welcome to sortBy LastName\n");
						manager.sortByName(listInMap);
						/*take sorted list and then edit into json file*/ 
						break;
				case 4: System.out.println("Welcome to sortBy Zip\n");
						manager.sortByZip(listInMap);
						/*take sorted list and then edit into json file*/ 
						break;
				case 5:System.out.println("Welcome to DeletePerson\n");
						listOfPersons=manager.deletePerson(listInMap);
						break;
				case 6:System.out.println("So AddressBookID:"+bookid);
					break;
				default:System.out.println("please enter validate option\n");
					break;
				}
			}else {
				System.out.println("Such AddressBook with"+ bookid +"is not present \n");
			}
		break;
	case 3:/* save specific address book in to json file */
		break;
	case 4:System.out.println("-------welcome to save as file-----\n");
			System.out.println("enter the name of file\n");
			String fileName=scanner.next();
			String file
		/*save specific address book in your created json file 
		 * means asked user to for name of json file 
		 * then create that json file and then save the data */
		break;
		
	case 5:System.out.println("------Thank u for operating r libaray-------");	
			break;
	default:System.out.println("Please Enter Valide Option\n");
			break;
	}
	}
	
	
	
	
}
}
