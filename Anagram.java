package assignment;
import java.util.Arrays;
public class Anagram {
	

static void checkAnagram(String str1,String str2) { 
	char a[]=str1.toCharArray();
	char b[]= str2.toCharArray();
	
	Arrays.sort(a);
	Arrays.sort(b);

	boolean res=Arrays.equals(a,b);
	if(res==true)
	{
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
	
	
		
	}
public static void main(String[] args) {
	 checkAnagram("Hello","Heloll");
}

}
