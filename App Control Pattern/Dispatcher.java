package ACP;

public class Dispatcher {

	private RockResult rock;
	private PaperResult paper;
	private ScissorsResult scissors;
	
	public Dispatcher(){
		rock = new RockResult();
		paper = new PaperResult();
		scissors = new ScissorsResult();
	}
	public void dispatch( String request ){
		if( request.equalsIgnoreCase("rock") ){
			rock.show();
		}
		else if(request.equalsIgnoreCase("paper") ){
			paper.show();
		}
		else {
			scissors.show();
		}
	}
}
