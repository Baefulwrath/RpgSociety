package ui;

import java.util.ArrayList;

public class UIhandler {
	public static ArrayList<Message> messages = new ArrayList<Message>();
	public static String activeMainMenu = "";

	public static void setup(){
		
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
	}
}
