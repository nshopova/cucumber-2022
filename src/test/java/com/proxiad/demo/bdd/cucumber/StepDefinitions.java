package com.proxiad.demo.bdd.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	private Player player;
	
	@Given("I am a new player")
	public void i_am_a_new_player() {
	    player = new Player();
	}

	@When("I start playing")
	public void i_start_playing() {
	    player.startGame();
	}

	@Then("my score is {int}")
	public void my_score_is(Integer score) {
	    assertEquals(score, player.getScore());
	}
	
	@Given("I am player")
	public void i_am_player() {
		player = new Player();
	}

	@When("I answer a question {int} correctly")
	public void i_answer_a_question_correctly(Integer int1) {
	    player.answer(1, true);
	}
}
