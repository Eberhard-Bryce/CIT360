package ACP;

import java.util.Scanner;

import ACP.Handle.*;

@SuppressWarnings("unused")
public class acpMainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AppController app = new AppController();        
		 	app.mapCommand("View", new Viewer());
	        app.mapCommand("Rock", new RockResult());
	        app.mapCommand("Paper", new PaperResult());
	        app.mapCommand("Scissors", new ScissorsResult());
	        app.mapCommand("End", new End());
	        
	        start(app);
	    }

	    private static void start(AppController app) {
	        app.handleRequest("View");
	        
	        @SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
	        String request = in.nextLine();
	        if (app.handlerMap.containsKey(request)==true) {
	            app.handleRequest(request);
	        } else {
	            app.handleRequest("Tryagain");
	        }
	        
	        start(app);
	    }
	    
	}
