package render.renderers;

import render.Renderer;
import ui.UIhandler;

public class Menu_Renderer extends Renderer{

	public Menu_Renderer() {
		super("MENU");
	}

	@Override
	public void loadSpecificResources() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mobileRender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void staticRender() {
		drawMenu(UIhandler.getMainMenu());
	}

}
