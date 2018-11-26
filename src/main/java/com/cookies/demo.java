package com.cookies;

public class demo {
	
	public static void main(String[] args) {
		
		String st="java by kiran";
		
		String str=" "+st;
		
		char ch[]=str.toCharArray();
		
		for (int i = 0; i < ch.length-1; i++) {
			
			if(ch[i]==' ')
			{
				ch[i+1]=(char) (ch[i+1]-32);
				
				
			}
			
		}
		
		System.out.println(ch);
	}

}
