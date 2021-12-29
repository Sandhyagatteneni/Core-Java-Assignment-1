package com.assignmentone;

public class NewEgg {
	private int eggs,gross, dozen;

	public void setEggs(int eggs) {
		this.eggs = eggs;
	}

	public int getGross() {
		gross_eggs();
		return gross;
	}
	public int getDozen() {
		dozen_eggs();
		return dozen;
	}

	public int getEggs() {
		return eggs;
	}
	public void gross_eggs() {
		gross = eggs/144;
		eggs = eggs%144;
	}
	public void dozen_eggs() {
		dozen = eggs/12;
		eggs = eggs%12;
	}
}
