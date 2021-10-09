package org.bank;

public class StateBank {
	public static void main(String[] args) {
		String d = "      i am studing in greens";
		String e = "      i am studing in greens";
		
				
		int length = d.length();
		System.out.println(length);
		String upperCase = d.toUpperCase();
		System.out.println(upperCase);
		char charAt = d.charAt(5);
		System.out.println(charAt);
	    int indexOf = d.indexOf('u');
	    System.out.println(indexOf);
	    String lowerCase = d.toLowerCase();
	    System.out.println(lowerCase);
	    String replace = d.replace("in", "to");
	    System.out.println(replace);
	    String replaceAll = d.replaceAll("greens", "white");
	    System.out.println(replaceAll);
	    boolean startsWith = d.startsWith("i");
	    System.out.println(startsWith);
	    boolean endsWith = d.endsWith("i");
	    System.out.println(endsWith);
	    int lastIndexOf = d.lastIndexOf('e');
	    System.out.println(lastIndexOf);
	    String trim = d.trim();
	    System.out.println(trim);
	    boolean contains = d.contains("studing");
	    System.out.println(contains);
	    String upperCase2 = e.toUpperCase();
	    System.out.println(upperCase2);
	    boolean equals = d.equals(e);
	    System.out.println(equals);
	    
	    
	    
	}
	

}
