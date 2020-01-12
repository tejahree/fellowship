package com.bridgelabz.fellowshipprogram.oops.Stock;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonOperation {
	
//	static String filePath="/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/inventoryManagement/data.json";
static ObjectMapper mapper= new ObjectMapper();

//static  ListOfAllData listReaded;

public  void toWriteIntoFile(String filepath,Object object) {
	try {
		//FileWriter file= new FileWriter("/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/inventoryManagement/inventory.json");
	///	file.write(object);
		mapper.writeValue(new File(filepath) , object);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static  Object  toReadFromFile(String filepath,Object object) throws JsonParseException, JsonMappingException, IOException {
	
	
		 return mapper.readValue(new File(filepath),  object.getClass());
	
}
}
