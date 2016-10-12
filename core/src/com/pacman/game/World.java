package com.pacman.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
	PacmanGame pacmanGame;
	public int x;
	public int y;
	private Maze maze;
	World(PacmanGame pacmanGame){
		this.pacmanGame = pacmanGame;
		x = 100;
		y = 100;
		maze = new Maze();
	}
	
	Maze getMaze(){
		return maze;
	}
}
