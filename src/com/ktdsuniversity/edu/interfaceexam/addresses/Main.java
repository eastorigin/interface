package com.ktdsuniversity.edu.interfaceexam.addresses;

public class Main {

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		
		Person p1 = new Person("kim", "seoul", "010-1234-1234", "kim@kim.co.kr");
		addressBook.creatNewAddress(p1);
		addressBook.creatNewAddress(p1);
		addressBook.creatNewAddress(p1);
		addressBook.creatNewAddress(p1);
		addressBook.creatNewAddress(p1);
		addressBook.creatNewAddress(p1);
		addressBook.creatNewAddress(p1);
		
		addressBook.readOneAddress(0);
		
		// Class.staticMethod.instanceMethod();
	}
}
