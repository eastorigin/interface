package com.ktdsuniversity.edu.interfaceexam.contact;

public class PhoneMain {

	public static void main (String[] args) {
		Phone phone = new Phone("010-1234-1324", "신동원", "010-9846-3540");
		
		phone.addNumber();
		
		phone.deleteNumber();
		
		phone.editNumber();
		
		phone.searchNumber();
		
		Contact contact1 = new Contact() {
			@Override
			public void editNumber() {
				System.out.println("일회용 번호 변경 완료");
				
			}
			
			@Override
			public void searchNumber() {
				System.out.println("일회용 번호 조회 완료");
				
			}
			
			@Override
			public void addNumber() {
				System.out.println("일회용 번호 추가 완료");
			}
			
			@Override
			public void deleteNumber() {
				System.out.println("일회용 번호 삭제 완료");
			}
		};
		
		contact1.addNumber();
		contact1.deleteNumber();
		contact1.editNumber();
		contact1.searchNumber();
	}
}
