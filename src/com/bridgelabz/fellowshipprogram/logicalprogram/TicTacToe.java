package com.bridgelabz.fellowshipprogram.logicalprogram;
import java.util.*;
public class TicTacToe {
	
	static char[][] printtable(char[][] arr) {//this function will just print the array in 3d grid form 
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" | ");
			}
		System.out.println();
		}
	return arr;//and return the arr
	}	
	
	static boolean check(char[][] arr,int option,int player) {
		
		int key=option;
	int 	a=player;
boolean status;
		switch (key) {//this switch option to change the value of arr as per option  
		case 0:if(arr[0][0]=='-') {
					if(a==10) {
						arr[0][0]='x';
						arr=printtable(arr);//the arr is return to check if arr or index of the array are filled with triple x or triple o and to print whether computer won of you won
						if((arr[0][0]=='x' && arr[1][0]=='x' &&arr[2][0]=='x')||(arr[0][1]=='x' && arr[1][1]=='x' &&arr[2][1]=='x')||(arr[0][2]=='x' && arr[1][2]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[0][1]=='x' &&arr[0][2]=='x')||(arr[2][0]=='x' && arr[2][1]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[1][1]=='x' &&arr[2][2]=='x')||(arr[0][2]=='x' && arr[1][1]=='x' &&arr[2][0]=='x'))
							System.out.println("computer win");
					}else {
						arr[0][0]='o';
						arr=printtable(arr);
						if((arr[0][0]=='o' && arr[1][0]=='o' &&arr[2][0]=='o')||(arr[0][1]=='o' && arr[1][1]=='o' &&arr[2][1]=='o')||(arr[0][2]=='o' && arr[1][2]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[0][1]=='o' &&arr[0][2]=='o')||(arr[2][0]=='o' && arr[2][1]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[1][1]=='o' &&arr[2][2]=='o')||(arr[0][2]=='o' && arr[1][1]=='o' &&arr[2][0]=='o'))
							System.out.println("you win");
						}
					}else {
						System.out.println("this is been filled please enter other option ");
					}
			break;
			
		case 1:if(arr[0][1]=='-') {
			if(a==10) {
				arr[0][1]='x';
				arr=printtable(arr);
				if((arr[0][0]=='x' && arr[1][0]=='x' &&arr[2][0]=='x')||(arr[0][1]=='x' && arr[1][1]=='x' &&arr[2][1]=='x')||(arr[0][2]=='x' && arr[1][2]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[0][1]=='x' &&arr[0][2]=='x')||(arr[2][0]=='x' && arr[2][1]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[1][1]=='x' &&arr[2][2]=='x')||(arr[0][2]=='x' && arr[1][1]=='x' &&arr[2][0]=='x'))
					System.out.println("computer win");
			}else {
				arr[0][1]='o';
				arr=printtable(arr);
				if((arr[0][0]=='o' && arr[1][0]=='o' &&arr[2][0]=='o')||(arr[0][1]=='o' && arr[1][1]=='o' &&arr[2][1]=='o')||(arr[0][2]=='o' && arr[1][2]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[0][1]=='o' &&arr[0][2]=='o')||(arr[2][0]=='o' && arr[2][1]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[1][1]=='o' &&arr[2][2]=='o')||(arr[0][2]=='o' && arr[1][1]=='o' &&arr[2][0]=='o'))
					System.out.println("you win");
				}
			}else {
				System.out.println("this is been filled please enter other option ");
			}
	break;
			
		case 2:if(arr[0][2]=='-') {
			if(a==10) {
				arr[0][2]='x';
				arr=printtable(arr);
				if((arr[0][0]=='x' && arr[1][0]=='x' &&arr[2][0]=='x')||(arr[0][1]=='x' && arr[1][1]=='x' &&arr[2][1]=='x')||(arr[0][2]=='x' && arr[1][2]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[0][1]=='x' &&arr[0][2]=='x')||(arr[2][0]=='x' && arr[2][1]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[1][1]=='x' &&arr[2][2]=='x')||(arr[0][2]=='x' && arr[1][1]=='x' &&arr[2][0]=='x'))
					System.out.println("computer win");
			}else {
				arr[0][2]='o';
				arr=printtable(arr);
				if((arr[0][0]=='o' && arr[1][0]=='o' &&arr[2][0]=='o')||(arr[0][1]=='o' && arr[1][1]=='o' &&arr[2][1]=='o')||(arr[0][2]=='o' && arr[1][2]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[0][1]=='o' &&arr[0][2]=='o')||(arr[2][0]=='o' && arr[2][1]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[1][1]=='o' &&arr[2][2]=='o')||(arr[0][2]=='o' && arr[1][1]=='o' &&arr[2][0]=='o'))
					System.out.println("you win");
				}
			}else {
				System.out.println("this is been filled please enter other option ");
			}
	break;
			
		case 3:if(arr[1][0]=='-') {
			if(a==10) {
				arr[1][0]='x';
				arr=printtable(arr);
				if((arr[0][0]=='x' && arr[1][0]=='x' &&arr[2][0]=='x')||(arr[0][1]=='x' && arr[1][1]=='x' &&arr[2][1]=='x')||(arr[0][2]=='x' && arr[1][2]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[0][1]=='x' &&arr[0][2]=='x')||(arr[2][0]=='x' && arr[2][1]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[1][1]=='x' &&arr[2][2]=='x')||(arr[0][2]=='x' && arr[1][1]=='x' &&arr[2][0]=='x'))
					System.out.println("computer win");
			}else {
				arr[1][0]='o';
				arr=printtable(arr);
				if((arr[0][0]=='o' && arr[1][0]=='o' &&arr[2][0]=='o')||(arr[0][1]=='o' && arr[1][1]=='o' &&arr[2][1]=='o')||(arr[0][2]=='o' && arr[1][2]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[0][1]=='o' &&arr[0][2]=='o')||(arr[2][0]=='o' && arr[2][1]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[1][1]=='o' &&arr[2][2]=='o')||(arr[0][2]=='o' && arr[1][1]=='o' &&arr[2][0]=='o'))
					System.out.println("you win");
				}
			}else {
				System.out.println("this is been filled please enter other option ");
			}
	break;
			
		case 4:if(arr[1][1]=='-') {
			if(a==10) {
				arr[1][1]='x';
				arr=printtable(arr);
				if((arr[0][0]=='x' && arr[1][0]=='x' &&arr[2][0]=='x')||(arr[0][1]=='x' && arr[1][1]=='x' &&arr[2][1]=='x')||(arr[0][2]=='x' && arr[1][2]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[0][1]=='x' &&arr[0][2]=='x')||(arr[2][0]=='x' && arr[2][1]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[1][1]=='x' &&arr[2][2]=='x')||(arr[0][2]=='x' && arr[1][1]=='x' &&arr[2][0]=='x'))
					System.out.println("computer win");
			}else {
				arr[1][1]='o';
				arr=printtable(arr);
				if((arr[0][0]=='o' && arr[1][0]=='o' &&arr[2][0]=='o')||(arr[0][1]=='o' && arr[1][1]=='o' &&arr[2][1]=='o')||(arr[0][2]=='o' && arr[1][2]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[0][1]=='o' &&arr[0][2]=='o')||(arr[2][0]=='o' && arr[2][1]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[1][1]=='o' &&arr[2][2]=='o')||(arr[0][2]=='o' && arr[1][1]=='o' &&arr[2][0]=='o'))
					System.out.println("you win");
				}
			}else {
				System.out.println("this is been filled please enter other option ");
			}
	break;
			
		case 5:if(arr[1][2]=='-') {
			if(a==10) {
				arr[1][2]='x';
				arr=printtable(arr);
				if((arr[0][0]=='x' && arr[1][0]=='x' &&arr[2][0]=='x')||(arr[0][1]=='x' && arr[1][1]=='x' &&arr[2][1]=='x')||(arr[0][2]=='x' && arr[1][2]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[0][1]=='x' &&arr[0][2]=='x')||(arr[2][0]=='x' && arr[2][1]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[1][1]=='x' &&arr[2][2]=='x')||(arr[0][2]=='x' && arr[1][1]=='x' &&arr[2][0]=='x'))
					System.out.println("computer win");
			}else {
				arr[1][2]='o';
				arr=printtable(arr);
				if((arr[0][0]=='o' && arr[1][0]=='o' &&arr[2][0]=='o')||(arr[0][1]=='o' && arr[1][1]=='o' &&arr[2][1]=='o')||(arr[0][2]=='o' && arr[1][2]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[0][1]=='o' &&arr[0][2]=='o')||(arr[2][0]=='o' && arr[2][1]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[1][1]=='o' &&arr[2][2]=='o')||(arr[0][2]=='o' && arr[1][1]=='o' &&arr[2][0]=='o'))
					System.out.println("you win");
				}
			}else {
				System.out.println("this is been filled please enter other option ");
			}
	break;
		case 6:if(arr[2][0]=='-') {
			if(a==10) {
				arr[2][0]='x';
				arr=printtable(arr);
				if((arr[0][0]=='x' && arr[1][0]=='x' &&arr[2][0]=='x')||(arr[0][1]=='x' && arr[1][1]=='x' &&arr[2][1]=='x')||(arr[0][2]=='x' && arr[1][2]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[0][1]=='x' &&arr[0][2]=='x')||(arr[2][0]=='x' && arr[2][1]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[1][1]=='x' &&arr[2][2]=='x')||(arr[0][2]=='x' && arr[1][1]=='x' &&arr[2][0]=='x'))
					System.out.println("computer win");
			}else {
				arr[2][0]='o';
				arr=printtable(arr);
				if((arr[0][0]=='o' && arr[1][0]=='o' &&arr[2][0]=='o')||(arr[0][1]=='o' && arr[1][1]=='o' &&arr[2][1]=='o')||(arr[0][2]=='o' && arr[1][2]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[0][1]=='o' &&arr[0][2]=='o')||(arr[2][0]=='o' && arr[2][1]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[1][1]=='o' &&arr[2][2]=='o')||(arr[0][2]=='o' && arr[1][1]=='o' &&arr[2][0]=='o'))
					System.out.println("you win");
				}
			}else {
				System.out.println("this is been filled please enter other option ");
			}
	break;
			
		case 7:if(arr[2][1]=='-') {
			if(a==10) {
				arr[2][1]='x';
				arr=printtable(arr);
				if((arr[0][0]=='x' && arr[1][0]=='x' &&arr[2][0]=='x')||(arr[0][1]=='x' && arr[1][1]=='x' &&arr[2][1]=='x')||(arr[0][2]=='x' && arr[1][2]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[0][1]=='x' &&arr[0][2]=='x')||(arr[2][0]=='x' && arr[2][1]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[1][1]=='x' &&arr[2][2]=='x')||(arr[0][2]=='x' && arr[1][1]=='x' &&arr[2][0]=='x'))
					System.out.println("computer win");
			}else {
				arr[2][1]='o';
				arr=printtable(arr);
				if((arr[0][0]=='o' && arr[1][0]=='o' &&arr[2][0]=='o')||(arr[0][1]=='o' && arr[1][1]=='o' &&arr[2][1]=='o')||(arr[0][2]=='o' && arr[1][2]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[0][1]=='o' &&arr[0][2]=='o')||(arr[2][0]=='o' && arr[2][1]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[1][1]=='o' &&arr[2][2]=='o')||(arr[0][2]=='o' && arr[1][1]=='o' &&arr[2][0]=='o'))
					System.out.println("you win");
				}
			}else {
				System.out.println("this is been filled please enter other option ");
			}
	break;
			
		case 8:if(arr[2][2]=='-') {
			if(a==10) {
				arr[2][2]='x';
				arr=printtable(arr);
				if((arr[0][0]=='x' && arr[1][0]=='x' &&arr[2][0]=='x')||(arr[0][1]=='x' && arr[1][1]=='x' &&arr[2][1]=='x')||(arr[0][2]=='x' && arr[1][2]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[0][1]=='x' &&arr[0][2]=='x')||(arr[2][0]=='x' && arr[2][1]=='x' &&arr[2][2]=='x')||(arr[0][0]=='x' && arr[1][1]=='x' &&arr[2][2]=='x')||(arr[0][2]=='x' && arr[1][1]=='x' &&arr[2][0]=='x'))
					System.out.println("computer win");
			}else {
				arr[2][2]='o';
				arr=	printtable(arr);
				if((arr[0][0]=='o' && arr[1][0]=='o' &&arr[2][0]=='o')||(arr[0][1]=='o' && arr[1][1]=='o' &&arr[2][1]=='o')||(arr[0][2]=='o' && arr[1][2]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[0][1]=='o' &&arr[0][2]=='o')||(arr[2][0]=='o' && arr[2][1]=='o' &&arr[2][2]=='o')||(arr[0][0]=='o' && arr[1][1]=='o' &&arr[2][2]=='o')||(arr[0][2]=='o' && arr[1][1]=='o' &&arr[2][0]=='o'))
					System.out.println("you win");
				}
			}else {
				System.out.println("this is been filled please enter other option ");
			}
	break;

		default:System.out.println("please enter valide option \n");
			break;
		}
		if((arr[0][0]!='-' && arr[0][1]!='-' && arr[0][2]!='-' && arr[1][0]!='-' && arr[1][1]!='-' && arr[1][2]!='-' && arr[2][0]!='-' && arr[2][1]!='-' && arr[2][2]!='-')||(arr[0][0]=='x' &&arr[1][0]=='x' &&arr[2][0]=='x')||(arr[0][0]=='o' &&arr[1][0]=='o' &&arr[2][0]=='o')||(arr[0][1]=='x' &&arr[1][1]=='x' &&arr[2][1]=='x')||(arr[0][1]=='o' &&arr[1][1]=='o' &&arr[2][1]=='o')||(arr[0][2]=='x' &&arr[1][2]=='x' &&arr[2][2]=='x')||(arr[0][2]=='o' &&arr[1][2]=='o' &&arr[2][2]=='o')||(arr[0][0]=='x' &&arr[0][1]=='x' &&arr[0][2]=='x')||(arr[0][0]=='o' &&arr[0][1]=='o' &&arr[0][2]=='o')||(arr[2][0]=='x' &&arr[2][1]=='x' &&arr[2][2]=='x')||(arr[2][0]=='o' &&arr[2][1]=='o' &&arr[2][2]=='o')||(arr[0][0]=='x' &&arr[1][1]=='x' &&arr[2][2]=='x')||(arr[0][0]=='o' && arr[1][1]=='o' && arr[2][2]=='o')||(arr[0][2]=='x' && arr[1][1]=='x' && arr[2][0]=='x')||(arr[0][2]=='o' && arr[1][1]=='o' && arr[2][0]=='o')) {
			status=false;
			return status;
		}
			else {
				status=true;
				return status;
				
			}
		
		
	}
	
public static void main(String args[]) {

int option;
int player=10,player2=11;//for player =10 its an computer of for palyer2=11 its an you 
boolean status=true;//this is an boolean variable to stop the while loop
char[][] arr=new char[3][3];
Set<Integer> set= new HashSet<Integer>();//set is use for keeping the track of random function and option taken from user 
Scanner sc= new Scanner(System.in);
Random r= new Random();
	System.out.println("WELCOME TO TIC-TAC-TOE");
	System.out.println("PLAYER1-COMPUTER\n ");
	System.out.println("PLAYER2-USER\n");
	System.out.println("IN FORMAT\n");
	System.out.println("0 | 1 | 2 |");
	System.out.println("3 | 4 | 5 |");
	System.out.println("6 | 7 | 8 |");
	arr[0][1]='-';//seting all the  variable of arr to '-'
	arr[0][0]='-';// so that even if the value is not present the it should be seen as - thst mean blank
	arr[0][2]='-';
	arr[1][0]='-';
	arr[1][1]='-';
	arr[1][2]='-';
	arr[2][0]='-';
	arr[2][1]='-';
	arr[2][2]='-';
	while(status!=false) {//to stop the game if the status it will run till  game get draw or won by some one 
		System.out.println("player1-computer");
		 option=r.nextInt(9);//random function will call for option
		 //the range of random function is between 0-8
		
		while(set.contains(option)) {//if random function return same value that the set contain then 
			option=r.nextInt(9);// agin random function should called and asign to option
			//while loop is used for if random function return the same value again and again then while random funtion
			//doesnot return different number form the set the random function will call again and again
		}
		 set.add(option);//this option value should add into set 
		System.out.println(set);
	  status=check(arr,option,player);//pass arr option and player number which will return true or false   
	 if(status==false)//this break the entire while loop when computer won so at that time status doe'nt check whith
		 //will loop so to avoid print of below statemenmt it exit the while loop
		  break;

	System.out.println("player1-you");
	System.out.println("enter option");
	
	 option=sc.nextInt();
	set.add(option);//this also add the option in set so that is computer vla random function return the same number that of player return the the random function  should call 
	System.out.println(set);
status=check(arr,option,player2);

}
}
}
/*(c1!=0 && c2!=0 && c3!=0 && c4!=0 && c5!=0 && c6!=0 && c7!=0 && c8!=0 && c9!=0) || (c1=c2=c3='x')
			|| (c1=c2=c3='o')||(c1=c4=c7='x')||(c1=c4=c7='o')||(c7=c6=c9='x')||(c7=c8=c9='o')||(c3=c6=c9='x')||(c3=c6=c9='o')||(c1=c5=c9='x')||(c1=c5=c9='o')||(c3=c5=c7='x')||(c3=c5=c9='o')
*/