/*

Implement an algorithm to determine if a string has all unique characters. What
if you cannot use additional data structures?

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class UniqueCharString {
	public static void main (String[] args) throws java.lang.Exception
	{
		//System.out.println("Result:"+uniqueCharactersMapImpl("abcdea"));
		System.out.println("Result:"+uniqueCharactersBitImpl(""));
	}
	
	public static boolean uniqueCharactersMapImpl(String s){
		Set<Character> set = new HashSet<Character>();
		char[] chrStr =  s.toCharArray();
		boolean result = true;
		for(char c: chrStr){
			if(set.contains(c)){
				result = false;
				break;				
			}
			set.add(c);
		}
		
		return result;
	}
	
	public static boolean uniqueCharactersBitImpl(String s){
		char[] chrStr = s.toCharArray();
		
		int flag = 0;
		boolean result = true;
		for(char c: chrStr){
			int num = c - 'a';
			if((flag & (1 << num)) > 0){
				result = false;
			}
			flag = flag | (1 << num);
		}
		
		return result;
		
	}
	
}
