package com.ktdsuniversity.edu.interfaceexam.animals;

/**
 * Bird
 * 	interface: Move, Bark, Eat, Fly
 * 	Bird is a Move
 * 	Bird is a Bark
 * 	Bird is a Eat
 * 	Bird is a Fly
 * 
 * 	Chicken
 * 		extends Bird
 * 		Chicken is a Bird
 * 		Chicken is a Move
 * 		Chicken is a Bark
 * 		Chicken is a Eat
 * 		Chicken is a Fly
 * 
 */
public class Chicken extends Bird {
	
	public Chicken (String name) {
		super(name);
	}


	@Override
	public void eat() { // 이미 만들어진 메소드를 재정의하면 색깔 있는 삼각형
		System.out.println(this.name + "이 부리로 모이를 먹습니다");
		
	}

	@Override
	public void bark() {
		System.out.println(this.name + " 지저귑니다");
		
	}

	@Override
	public void walk() {
		System.out.println(this.name + " 납니다");
		
	}

	@Override
	public void run() {
		System.out.println(this.name + " 뜁니다");
		
	}

	@Override
	public void fly() {
		System.out.println(this.name + "이 3초간 퍼덕입니다");
	}
	
}
