/*
Implement a function void reverse(char* str) in C or C++ which reverses a nullterminated
string.

I am implementing it in java. A simple reverse function.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(reverseStr("1221345"));
	}
	
	
	
	public static String reverseStr(String s){
		int start = 0;
		int end = s.length() - 1;
		
		//Required if implementing recursive solution. I did not want to convert char[] to string in each recursive step.
		//char[] chrStr = s.toCharArray();

		if(end != -1){
			//Code for recursive solution here
			//char[] resChar =  recurRev(chrStr, start, end);
			//return new String(resChar);

			return rev(s, start, end);
		}
			
		return "";	
	}
	
	
	public static char[] recurRev(char[] s, int start, int end){
		char temp;
		
		if(start >= end)
			return s;
		
		temp = s[start];
		s[start] = s[end];
		s[end] = temp;
		
		return recurRev(s, ++start, --end);
		
	}
	
	public static String rev(String s, int start, int end){
		char temp;
		char[] chrStr = s.toCharArray();
		while(start < end){
			temp = chrStr[start];
			chrStr[start] = chrStr[end];
			chrStr[end] = temp;
			
			start++; end--;
		}
		
		return new String(chrStr);
	}
	
}