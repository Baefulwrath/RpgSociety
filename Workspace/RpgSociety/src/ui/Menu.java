package ui;

import java.awt.Rectangle;
import java.util.ArrayList;

import render.NinePatchImage;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

public abstract class Menu {
	public ArrayList<Label> labels = new ArrayList<Label>();
	public ArrayList<Image> images = new ArrayList<Image>();
	public ArrayList<NinePatchImage> ninepatches = new ArrayList<NinePatchImage>();
	public ArrayList<Button> buttons = new ArrayList<Button>();
	public ArrayList<TileImage> tileImages = new ArrayList<TileImage>();
	public ArrayList<Rectangle> collisionAreas = new ArrayList<Rectangle>();
	public float OPACITY = 1.0f;
	public int TITLEX = 0;
	public int TITLEY = 0;
	public boolean RENDERTITLE = false;
	public String TITLE = "UNTITLED";

}
