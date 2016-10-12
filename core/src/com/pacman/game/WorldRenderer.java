package com.pacman.game;

public class WorldRenderer{

	private MazeRenderer mazeRenderer;
	 
    public WorldRenderer(PacmanGame pacmanGame, World world) {
        // ...        
        mazeRenderer = new MazeRenderer(pacmanGame.batch, world.getMaze());
    }
 
    public void render(float delta) {
        mazeRenderer.render();
        // ...
    }
	
}
