package com.ktdsuniversity.edu.interfaceexam.contact;

public interface Contact {

	public default void addNumber() {
		System.out.println("연락처를 추가했습니다.");
	}
	
	public default void deleteNumber() {
		System.out.println("연락처를 삭제했습니다.");
	}
	
	public void searchNumber();
	
	public void editNumber();
	
}
