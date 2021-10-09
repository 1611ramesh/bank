    package org.bank;


public class Hdfcbank {
private void Hdfc() {
try {
	int a =1 ;
	int b =2 ;
int	c=a/b ;
	System.out.println("no ae");
	
} catch (Exception e) {
	System.out.println("first ae");
	throw e ;
}

}
	
	
public static void main(String[] args) {
	
	Hdfcbank hd = new Hdfcbank();
	try {
		hd.Hdfc();
	} 
catch (Exception e) {
		
		System.out.println("secound ae");
	}
	
}
	   
}