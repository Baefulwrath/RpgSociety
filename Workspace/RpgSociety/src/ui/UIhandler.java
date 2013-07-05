package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ui.mainmenus.*;

public class UIhandler {
	public static HashMap<String, MainMenu> mainMenus = new HashMap<String, MainMenu>();
	public static ArrayList<Message> messages = new ArrayList<Message>();
	public static String activeMainMenu = "";

	public static void setup(){
		mainMenus.put("main", new MAINMENU_main());
		
		activeMainMenu = "main";
	}
	
	public static void print(String s){
		System.out.println(s);
		messages.add(new Message(s, 4000));
	}
	
	public static void print(String s, int time){
		System.out.println(s);
		messages.add(new Message(s, time));
	}

	public static void reset() {
	}

	public static void update() {
	    for(Map.Entry<String, MainMenu> entry : mainMenus.entrySet()){
	    	mainMenus.get(entry.getKey()).update();
	    }
	}
	
	public static MainMenu getMainMenu(){
		return mainMenus.get(activeMainMenu);
	}
}
