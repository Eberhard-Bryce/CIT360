
import java.io.BufferedReader; 
import java.io.InputStreamReader;                                  
import java.net.HttpURLConnection; 
import java.net.URL; 
import java.util.Scanner;

public class HTTPConnect {

	public static void main(String[] args) throws Exception {

		// Creates new httpConnection object from class
		HTTPConnect test = new HTTPConnect();

		test.sendGet();
	}

	// sendGet() method
	private void sendGet() throws Exception {
		try {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// asks for website 
		System.out.print("Enter website for get request.\n");
		System.out.print("Full URL: ");
		String website = input.next();

		URL object = new URL(website);
		HttpURLConnection connect = (HttpURLConnection) object.openConnection();

		// Sets the request method to GET
		connect.setRequestMethod("GET");

		

		// Makes a query for response code
		// If connection code is 200 it passes
		
		int response = connect.getResponseCode();
		String message;
		if (response == 200)
		{
			message = "passed";
		}
		else
		{
			response = "failed";
		}
		System.out.println("\nSending (GET) request to URL: " + website);
		System.out.println("Response Code: " + response + " Test " + message);

		// Uses connection to open an input stream reader and read in the html
		BufferedReader read = new BufferedReader(new InputStreamReader(connect.getInputStream()));

		String input;

		// Uses while loop to print what was decoded 
		System.out.println("Response from (GET) request: ");
		while ((input = read.readLine()) != null) {
			System.out.println(input);
		}
		// Close the input stream
		read.close();
	}
		catch(Exception e){
	           //Print the exception if we have a bad URL
	           System.out.println(e);
	}
	}
	}
