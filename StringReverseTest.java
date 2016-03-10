package com.acadglid.java.core.session4.assignment4;

import java.util.Scanner;

public class StringReverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str=s.next();
		char[] tempArray=str.toCharArray();
		for(int i=0; i<tempArray.length/2;i++){
			char temp=tempArray[i];
			tempArray[i]=tempArray[tempArray.length-i-1];
			tempArray[tempArray.length-1-i]=temp;
		}
		str=String.valueOf(tempArray);
		
		System.out.println(str.toString());
		
	}

}
