package org.firstfloor;

public class NinthStandard {
	
	public static void main(String[] args) {
		
		String s = "X years of testing";
		
		String[] s1 = s.split(" ");
		
		String[] s2 = new String[s1.length];
		
		for (int i = 0; i < s1.length; i++) { 
			
			if(i == 0 || i == 2){
				s2[i+1] = s1[i];
			}else if(i == 1 || i == 3){
				s2[i-1] = s1[i];
			}
			
		}
		
		for (int i = 0; i < s2.length; i++) {
			
			System.out.print(s2[i]);
			System.out.print(" ");
			
		}
		
	}

}
