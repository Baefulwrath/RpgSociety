package ui;

public enum UICType {
	DEFAULT, MENU, MAINMENU, HUD;
	
    @Override
    public String toString() {
        return super.toString();
    }
    
    public static UICType parseState(String state){
    	UICType temp = DEFAULT;
    	for(int i = 0; i < values().length; i++){
    		if(state.equals(values()[i].toString())){
    			temp = values()[i];
    		}
    	}
    	return temp;
    }
}
