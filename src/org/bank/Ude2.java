package org.bank;

public class Ude2 {
	
	public static void main(String[] args) {
		
		try {
			throw new Ude1("ramesh");
		} catch (Ude1 e) {
			String user = e.user();
			System.out.println(user);
		}
		}
		
	
	
}
