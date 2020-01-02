package com.bridgelabz.fellowshipprogram.functionalprogram;
import java.util.*;

public class WindChill {
public static void main(String args[]) {
	double v,t;
	double w;
	Scanner sc= new Scanner (System.in);
	
	System.out.println("enter the temperature <= 50");
	t=sc.nextDouble();
	
	System.out.println("enter the windspeed > 3 and <=120");
	v=sc.nextDouble();
	
	if(Math.abs(t)>50 || v>120 || v<3) {
		System.out.println("Please enter correct input");
	}else {
	w= 35.74 + 0.6215*t +( 0.4275*t -35.75)* Math.pow(v, 0.16);

	System.out.println("the wind chill of given temperature and windspeed is  "+w);}

}
}
