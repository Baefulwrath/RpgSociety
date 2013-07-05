package ui;


public abstract class Hud extends UIComponent{
	public Hud(int x, int y, int w, int h){
		super(x, y, w, h);
		UICT = UICType.HUD;
	}
	
}
