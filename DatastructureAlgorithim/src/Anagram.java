import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first string");
	String str=sc.nextLine();
	System.out.println("Enter second string");
	String str1=sc.nextLine();
    String rstr=removeSpace(str);
    String rstr1=removeSpace(str1);
	boolean result=compare(rstr,rstr1);
	if(result) {
		System.out.println("sentence is anagram");
	}
	else {
		System.out.println("sentence is not anagram");
	}
}
private static boolean compare(String rstr, String rstr1) {
	String lstr=rstr.toLowerCase();
	String lstr1=rstr1.toLowerCase();
	String dstr=sort(lstr);
	String dstr1=sort(lstr1);
	char ch[]=dstr.toCharArray();
	char ch1[]=dstr1.toCharArray();
	if(dstr.length()!=dstr1.length()) {
	
	        return false;
}
	else {
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=ch1[i]) {
				return false;
			}
		}
		return true;
	}
	
	
}

private static String sort(String lstr) {
	char ch[]=lstr.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		for (int j = i+1; j < ch.length; j++) {
			if(ch[i]>ch[j]) {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
	}
	String st=new String(ch);
	return st;
}

private static String removeSpace(String str) {
	char ch[]=str.toCharArray();
	String nstr="";
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]!=' ') {
			nstr=nstr+ch[i];
		}
	}
	return nstr;
}
}
