/*
Assume you have a method isSubstring which checks if one word is a
substring of another. Given two strings, si and s2, write code to check if s2 is
a rotation of si using only one call to isSubstring (e.g.,"waterbottle"is a rotation
of "erbottlewat").
*/

public class IsRotation{
	public static boolean checkRotation(String s1, String s2){
		String newString = s1 + s1;
		return isSubstring(newString, s2);
	}

}