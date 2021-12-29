package com.delhi.zoo;
import org.animals.*;
public class DelhiZoo {
	public static void main(String[] args) {
		Deer d = new Deer();
		Elephant e = new Elephant();
		Giraffe g = new Giraffe();
		Lion l = new Lion();
		Monkey m = new Monkey();
		Tiger t = new Tiger();
		d.isVegetarian();
		d.canClimb();
		d.sound();
		e.isVegetarian();
		e.canClimb();
		e.sound();
		g.isVegetarian();
		g.canClimb();
		g.sound();
		l.isVegetarian();
		l.canClimb();
		l.sound();
		m.isVegetarian();
		m.canClimb();
		m.sound();
		t.isVegetarian();
		t.canClimb();
		t.sound();
	}
	
}