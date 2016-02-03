package com.madhu;

public class ContactEx {
	public static void main(String[] args) {
		
		//This is sample comment
		
		Contact c1= new Contact();
		c1.setId(111);
		c1.setName("Madhusudhan");
		c1.setAddress("ABCD Street,XYZ City,UK");
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getAddress());
	}

}
