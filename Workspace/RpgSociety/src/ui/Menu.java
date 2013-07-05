package ui;

public abstract class Menu extends UIComponent{
	public Menu(int tx, int ty, int x, int y, int w, int h){
		super(x, y, w, h);
		UICT = UICType.MENU;
		TITLEX = tx + BOX.x;
		TITLEY = ty + BOX.y;
	}
	
	public int TITLEX = 0;
	public int TITLEY = 0;
	
}
