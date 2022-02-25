package com.proxiad.demo.bdd.cucumber;


public class Player {
	private int score = 0;

	public void startGame() {
		System.out.println("Start game");
	}

	public Integer getScore() {
		return score;
	}

	public void answer(int i, boolean b) {
		score = 100;
	}

}
