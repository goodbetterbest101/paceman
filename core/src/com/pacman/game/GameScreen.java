package com.pacman.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class GameScreen extends ScreenAdapter{
	private PacmanGame pacmanGame;
	private Texture pacmanImg;
	private int x;
	private int y;
	World world = new World(pacmanGame);
	
	public GameScreen(PacmanGame pacmanGame){
		this.pacmanGame = pacmanGame;
		pacmanImg = new Texture("pacman.png");
		x = world.x;
		y = world.y;
	}
	
	public void update(float delta){
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            world.x -= 10;
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            world.x += 10;
        }
	}
	
	@Override
    public void render(float delta) {
//		world.update(delta);
		Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        SpriteBatch batch = pacmanGame.batch;
        batch.begin();
        update(delta);
        batch.draw(pacmanImg,world.x,world.y);
        batch.end();
    }
}
