package ACP;

public class Viewer implements Handle{

    @Override
    public void Show() {
       System.out.println("");
    	System.out.println("Please Choose one of the options below: ");
       System.out.println("Rock");
       System.out.println("Paper");
       System.out.println("Scissors");
       System.out.println("End");
       
    }
    
}