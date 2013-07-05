package ui;

import render.Renderinghandler;

public abstract class MainMenu extends Menu{
	public MainMenu(){
		super(200, -100, (int) Renderinghandler.getScreenX(), (int) -Renderinghandler.getScreenY(), (int) Renderinghandler.w, (int) Renderinghandler.h);
		UICT = UICType.MAINMENU;
		RENDERTITLE = true;
	}

}
