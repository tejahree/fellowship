package com.bridgelabz.fellowshipprogram.oops.inventoryManagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonOperation {
	
	String filePath="/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/inventoryManagement/inventory.json";
ObjectMapper mapper= new ObjectMapper();
	
public  void toWriteIntoFile(Object object) {
	try {
		//FileWriter file= new FileWriter("/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/inventoryManagement/inventory.json");
	///	file.write(object);
		mapper.writeValue(new File(filePath), object);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void toReadFromFile() {
	
}
}
