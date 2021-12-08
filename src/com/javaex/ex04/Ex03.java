package com.javaex.ex04;

import java.util.HashSet;

public class Ex03 {

	public static void main(String[] args) {
		
		HashSet<Integer> hSet= new HashSet<Integer>();
		
		
		do {
			
			hSet.add((int)(Math.random()*45)+1);	
			
		}
		while (hSet.size()<6);

		System.out.println(hSet.toString());
	}
}
