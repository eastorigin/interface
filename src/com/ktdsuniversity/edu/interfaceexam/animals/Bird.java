package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Bark;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Eat;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Fly;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Move;

public class Bird implements Move, Bark, Eat, Fly {
	
	protected String name;
	
	public Bird (String name) {
		this.name = name;
	}

	@Override
	public void fly() { // interface를 구현하면 빈 삼각형
		System.out.println(this.name + "이 납니다");
	}

	@Override
	public void eat() {
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

	
}
