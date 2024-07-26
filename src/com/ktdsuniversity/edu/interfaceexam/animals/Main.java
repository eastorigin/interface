package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Bark;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Eat;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Fly;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Move;

public class Main {
	
	public static void flying(Fly fly) {
		fly.fly();
	}
	
	public static void moving(Move move) {
		move.run();
		move.walk();
	}
	
	public static void eating(Eat eat) {
		eat.eat();
	}
	
	public static void barking(Bark bark) {
		bark.bark();
	}

	public static void main (String[] args) {
		
		// 상속: IS A ==> Sub Class is a Super Class
		// 인터페이스 구현: IS A ==> Instance is a Interface
		// Dog ==> Move, Eat, Bark
		
		Dog ppoppy = new Dog("뽀삐");
		
		Eat eat = ppoppy;
		eat.eat();
		// eat.walk();
		
		Move move = ppoppy;
		move.run();
		move.walk();
		
		Bark bark = ppoppy;
		bark.bark();
		
		ppoppy.walk();
		ppoppy.run();
		ppoppy.eat();
		ppoppy.bark();
		
		// flying(ppoppy);
		eating(ppoppy);
		barking(ppoppy);
		moving(ppoppy);
		
		Bird pigeon = new Bird("구구");
		pigeon.walk();
		pigeon.run();
		pigeon.eat();
		pigeon.bark();
		pigeon.fly();
		
		flying(pigeon);
		eating(pigeon);
		barking(pigeon);
		moving(pigeon);
		
		Chicken chicken = new Chicken("꼬꼬");
		chicken.walk();
		chicken.run();
		chicken.eat();
		chicken.bark();
		chicken.fly();
		
		flying(chicken);
		eating(chicken);
		barking(chicken);
		moving(chicken);
		
		Duck duck = new Duck("덕덕");
		duck.fly();
		
		Person kim = new Person("김");
		kim.eat();
		kim.speak();
		kim.think();
		kim.walk();
		kim.work();
		
		// flying(kim);
		eating(kim);
		// barking(kim);
		moving(kim);
	}
}
