package org.bank;

public class Kotacbank {
	
public static void main(String[] args) {     
	
String r = "my name is ramesh";

int length = r.length();
System.out.println(length);

boolean f = r.isEmpty();
System.out.println(f);

char q = r.charAt(3);
System.out.println(q);

int j = r.indexOf("n");
System.out.println(j);

String g = r.replace("m", "q");
System.out.println(g);

int l = r.lastIndexOf("m");
System.out.println(l);

String upperCase = r.toUpperCase();
System.out.println(upperCase);

String lowerCase = r.toLowerCase();
System.out.println(lowerCase);

boolean p = r.startsWith("n");
System.out.println(p);
boolean m = r.endsWith("y");
System.out.println(m);

boolean n = r.contains("z");
System.out.println(n);

String replaceAll = r.replaceAll("name", "man");
System.out.println(replaceAll);

String replace = r.replace("my", "mytun");
System.out.println(replace);

String trim = r.trim();
System.out.println(trim);











}
}