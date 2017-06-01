package com.javacore.basic;

public class ScoreBoard {
	private int numEntries = 0;
	private GameEntries[] board;
	
	public ScoreBoard(int capacity) {
		board = new GameEntries[capacity];
	}
	
	public void add(GameEntries entries){
		if (numEntries < board.length) {
			
		}
	}
}
