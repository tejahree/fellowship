package com.bridgelabz.fellowshipprogram.oops.inventoryManagement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.codehaus.jackson.map.ObjectMapper;



public class InventoryManagement {
public static void main(String[] args) {
	JsonOperation operation= new JsonOperation();
	String filePath="/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/inventoryManagement/data.json";
	//String filePath="/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/inventoryManagement/inventory.json";
	String object,object1,object2;
ArrayList<Rice> listOfRice= new ArrayList<Rice>();
ArrayList<Wheat> listOfWheat= new ArrayList<Wheat>();
ArrayList<Pulses> listOfPulses= new ArrayList<Pulses>();
listOfRice.add(new Rice("basmati", 5, 72));
listOfRice.add(new Rice("basmatiTukada", 5, 84));
listOfRice.add(new Rice("kolam", 4, 52));
listOfRice.add(new Rice("WadiyaKolam",3,45));
listOfWheat.add(new Wheat("normal", 6, 42));
listOfWheat.add(new Wheat("cheap", 6, 32));
listOfWheat.add(new Wheat("costly",2, 54));
listOfPulses.add(new Pulses("kalaVatana", 3, 45));
listOfPulses.add(new Pulses("chavali", 1, 25));
listOfPulses.add(new Pulses("kaboli chana", 5, 32));

	ListOfAllData list= new ListOfAllData();
	ObjectMapper mapper= new ObjectMapper();
	
//	list.rice.setRice(r);
//	list.add(new Rice("basmatiTukada", 5, 84));
//	list.add(new Wheat("normal", 4, 42));
	 Rice rice = new Rice(); 
	 rice.setName("abc1"); 
	 rice.setPricePerKg(60);
	  rice.setWeight(7);
	  rice.setName("abc1"); 
		 rice.setPricePerKg(60);
		  rice.setWeight(7);
		  rice.setName("abc1"); 
			 rice.setPricePerKg(60);
			  rice.setWeight(7);
	//  ArrayList<Rice> listOfRice= new ArrayList<Rice>();
	//  listOfRice.add(new Rice("basmati", 5, 75));
	  list.setObjectRice(listOfRice);
	  list.setObjectPulses(listOfPulses);
	  list.setObjectWheat(listOfWheat);
	  try {
		mapper.writeValue(new File(filePath), list);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 //operation.toWriteIntoFile(listOfRice);
	// operation.toWriteIntoFile(listOfWheat);
	// operation.toWriteIntoFile(listOfPulse);
	/* try {
		 object=mapper.writeValueAsString(listOfRice);
		 object1=mapper.writeValueAsString(listOfWheat);
		 object2=mapper.writeValueAsString(listOfPulses);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
/*	try {
		 object=mapper.writeValueAsString(listOfRice);
		 operation.toWriteIntoFile(listOfRice);
		 operation.toWriteIntoFile(listOfWheat);
		 operation.toWriteIntoFile(listOfPulse);
		 System.out.println(object);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	 System.out.println(list.ObjectRice.get(0).getName());
	//System.out.println(list.rice.get(1).getName());
	
}
}
