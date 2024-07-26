package com.ktdsuniversity.edu.interfaceexam.animals.interfaces;

public interface Human extends Move, Eat { // interface만 여러 개 상속 가능
	
	public void work();
	
	public void speak();
	
	public void think();

}
