package com.bridgelabz.fellowshipprogram.oops.Stock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class Stock {
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	Scanner scanner= new Scanner(System.in);
	String filePath="/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/Stock/stock.json";
JsonOperation operation= new JsonOperation();
	ArrayList<StockPortFolio> list= new ArrayList<StockPortFolio>();
list=(ArrayList<StockPortFolio>) JsonOperation.toReadFromFile(filePath, list);
System.out.println("Enter the number of stock\n");
int numberOfStock=scanner.nextInt();
String name;
int noOfShare,sharePrice,totalPrice;
while(list.size()!=numberOfStock) {
		System.out.println("Enter the stockName\n");
		name=scanner.next();
		System.out.println("Enter NumberOFShare\n");
		noOfShare=scanner.nextInt();
		System.out.println("Enter SharePrice\n");
		sharePrice=scanner.nextInt();
		totalPrice=noOfShare*sharePrice;
		list.add(new StockPortFolio(name, noOfShare, sharePrice,totalPrice));
	
}
int totalSharePRice=0;
int totalShare=0;
for(int i=0;i<list.size();i++) {
	totalSharePRice=(totalSharePRice)+(list.get(i).getPrice());
	totalShare=totalShare+(list.get(i).getNumberOfShare());
}
operation.toWriteIntoFile(filePath, list);
System.out.println("TOTAL SHARE PRICE IS: "+totalSharePRice);
System.out.println("TOTAL SHARE: "+totalShare);


}
}
