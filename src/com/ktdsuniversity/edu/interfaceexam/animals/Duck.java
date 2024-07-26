package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Bark;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Eat;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Fly;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Move;

public class Duck implements Fly, Move, Bark, Eat {

	private String name;
	
	public Duck(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println(this.name + "이 모이를 먹습니다");
		
	}

	@Override
	public void bark() {
		System.out.println(this.name + ": 꽥꽥");
		
	}

	@Override
	public void walk() {
		System.out.println(this.name + " 걷습니다");
	}

	@Override
	public void run() {
		System.out.println(this.name + " 뜁니다");
		
	}
}
