package com.assignmentone;

public class NewEggMain {
	public static void main(String[] args) {
		NewEgg n = new NewEgg();
		n.setEggs(256);
		System.out.println(n.getGross()+" Gross, "+n.getDozen()+" Dozens and "+n.getEggs()+" Eggs");
	}
}
