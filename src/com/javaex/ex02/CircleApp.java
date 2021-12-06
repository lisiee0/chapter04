package com.javaex.ex02;

public class CircleApp {

	public static void main(String[] args) {
		
		Circle c01= new Circle(5);
		Circle c02= new Circle(7);
		
		CircleList cList= new CircleList();
		
		cList.add(c01);
		cList.add(c02);
		
		
		System.out.println(cList.size());
		System.out.println(cList.get(1).toString());
		
		Circle c03= new Circle(11);
		cList.add(c03);
		System.out.println(cList.toString());
	}

}
