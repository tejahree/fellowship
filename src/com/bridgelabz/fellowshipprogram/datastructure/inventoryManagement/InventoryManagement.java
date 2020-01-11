package jsonProject;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;



	public class InventoryManagement {
	public static void main(String[] args) {
		JsonOperation operation= new JsonOperation();
		
		String filePath="/Users/ACER/workspace/jsonProject/src/jsonProject/inventoryManagement.json";
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
		
//		list.rice.setRice(r);
//		list.add(new Rice("basmatiTukada", 5, 84));
//		list.add(new Wheat("normal", 4, 42));
	/*	 Rice rice = new Rice(); 
		 rice.setName("abc1"); 
		 rice.setPricePerKg(60);
		  rice.setWeight(7);
		  rice.setName("abc1"); 
			 rice.setPricePerKg(60);
			  rice.setWeight(7);
			  rice.setName("abc1"); 
				 rice.setPricePerKg(60);
				  rice.setWeight(7);*/
		//  ArrayList<Rice> listOfRice= new ArrayList<Rice>();
		//  listOfRice.add(new Rice("basmati", 5, 75));
		  list.setObjectRice(listOfRice);
		  list.setObjectPulses(listOfPulses);
		  list.setObjectWheat(listOfWheat);
		  operation.toWriteIntoFile(list);
		  int totalRice=(list.ObjectRice.get(0).getWeight())*(list.ObjectRice.get(0).getPricePerKg());
		  Rice rice=new Rice();
		  rice.setTotal(totalRice);
		  int totalWheat=(list.ObjectWheat.get(0).getWeight())*(list.ObjectWheat.get(0).getPricePerKg());
		  Wheat wheat=new Wheat();
		  wheat.setTotal(totalWheat);
		  try {
			object=mapper.writeValueAsString(list);
			System.out.println(object);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//  operation.toWriteIntoFile(listOfWheat);
 		//mapper.writeValue(new File(filePath), listOfRice);
		//mapper.writeValue(new File(filePath), listOfPulses);
		//mapper.writeValue(new File(filePath), listOfWheat);
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


