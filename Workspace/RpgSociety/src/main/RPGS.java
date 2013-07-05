package main;

import input.Inputhandler;
import render.Assethandler;
import render.Renderinghandler;
import scripting.Scripthandler;
import ui.UIhandler;
import world.Worldhandler;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import editor.Editorhandler;

import static main.State.*;
import static com.badlogic.gdx.Gdx.*;

public class RPGS implements ApplicationListener {
	public static State state = State.DEFAULT;
	public static boolean paused = false;
	public static boolean exitProgram = false;
	
	public RPGS(State startupState){
    	state = startupState;
    }
	
	@Override
	public void create() {
		Renderinghandler.setup();
		Worldhandler.load();
		Editorhandler.setup();
		Inputhandler inputhandler = new Inputhandler();
		UIhandler.setup();
		Scripthandler.setup();
		input.setInputProcessor(inputhandler);
	}

	@Override
	public void dispose() {
		Renderinghandler.dispose();
		Assethandler.dispose();
		UIhandler.reset();
	}

	@Override
	public void render() {
		if(exitProgram){
			exit();
		}else{
			try{
				Thread.sleep(1);
				updateSpecific();
				updateGeneral();
			}catch(Exception ex){
				ex.printStackTrace(System.out);
			}
		}
	}
	
	public void updateSpecific(){
		switch(state){
			case DEFAULT:
				break;
			case MENU:
				break;
			case EDITOR:
				Editorhandler.update();
				break;
			case GAME:
				Worldhandler.update();
				break;
		}
	}
	
	public void updateGeneral(){
		Scripthandler.update();
		UIhandler.update();
		Renderinghandler.render();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
	
	public static void changeState(State s){
		state = s;
		UIhandler.reset();
	}
	
	public static void changeState(String s){
		state = State.parseState(s);
		UIhandler.reset();
	}
	
	public void exit(){
		dispose();
		System.exit(0);
	}
}
