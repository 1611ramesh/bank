package org.bank;

public class StringTypes {
	public static void main(String[] args) {
		System.out.println("literal");                        //literal string
		String a ="apple";
		int a1 = System.identityHashCode(a);
		System.out.println(a1);
		String b ="apple";
	int b1 = System.identityHashCode(b);
	System.out.println(b1);
	
	System.out.println("\n" +"non literal");                  //non literal string
	String c = new String("orange");
	int c1 = System.identityHashCode(c);
	System.out.println(c1);
	String d = new String("orange");
	int d1 = System.identityHashCode(d);
	System.out.println(d1);
	
	System.out.println("\n"+"mutable");                       //mutable string 
	StringBuffer e = new StringBuffer("my name is ");
	int e1 = System.identityHashCode(e);
	System.out.println(e1);
	StringBuffer f = new StringBuffer("ramesh");
	int f1 = System.identityHashCode(f);
	System.out.println(f1);
	StringBuffer append = e.append(f);
	int g = System.identityHashCode(append);
	System.out.println(g);
	
	System.out.println("\n"+"immutable");                      //immutable string 
	String h =("i am studing in ");
	int hj = System.identityHashCode(h);
	System.out.println(hj);
	String i = ("greens");
	int iw = System.identityHashCode(i);
	System.out.println(iw);
	 String j = h.concat(i);
int k = System.identityHashCode(j);
System.out.println(k);
	
	
	
	
	
	
	}
	
	

}
