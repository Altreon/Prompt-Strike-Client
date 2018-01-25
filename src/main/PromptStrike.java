package main;

//S�curit� nommage, il est possible que 2 unit� de nom diff�rent soit cr�er dans 2 factory diff�rentes.


import com.badlogic.gdx.Game;

import display.GameDisplay;
public class PromptStrike extends Game {
	
	private main.Game game;
	
	private GameDisplay gameDisplay;
	// private InputWindows
	// private OutputWindows
	
	private Command commande;
	
	@Override
	public void create () {
		game = new main.Game();
		
		gameDisplay = new GameDisplay(game);
		super.setScreen(gameDisplay);
		
		commande = new Command(game, gameDisplay.getInputScreen());
	}

	@Override
	public void render () {
		super.render();
		game.update();
	}
	
	@Override
	public void dispose () {
	
	}
}
