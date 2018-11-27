import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Creates scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Serialize\n");

		String user = null;
		boolean loop = true;
		
		// Menu
		while (loop) {

			System.out.print("\nPlease choose one from the following: Create | Parse | Close");
			System.out.print("\n: ");
			try {
				user = input.next();
			} catch (Exception e) {

			}

			switch (choice) {

			case "Create":
				jCreate();
				break;

			case "Parse":
				jParse();
				break;

			case "Close":
				loop = false;
				break;

			default:
				System.out.print("\nNot Valid\n");
				break;
			}
		}

		System.out.print("\nCompleted\n");
	}
	@SuppressWarnings("unchecked")
	private static void jCreate() throws IOException {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Gathers user info
		System.out.print("\nEnter your last name: ");
		String lastName = input.next();

		System.out.print("Enter your first name: ");
		String firstName = input.next();

		System.out.print("Please enter age: ");
		int age = input.nextInt();


		System.out.print("Enter a filename: ");
		String fileHeader = input.next();

		// puts info into JSON object.
		JSONObject account = new JSONObject();
			
			account.put("lastName", lastName);
			account.put("firstName", firstName);
			account.put("age", age);

		
			   
			
		// Begin serialization
		System.out.print("\nfinalizing file\n");

		try (FileWriter file = new FileWriter("/Users/Bryce/CIT360/" + fileHeader + ".json")) {
			file.write(account.toJSONString());
		
		

        // Success Message
		System.out.print("\nFile Complete\n");
		}
	}

	private static void jParse() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// Create the scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Gets filename
		System.out.print("\nEnter a filename: ");
		String fileHeader = input.next();
		
		// Attempt to deserialize
		System.out.print("\nParsing...\n");
		
		JSONParser parser = new JSONParser();
		 
        try {
 
            Object obj = parser.parse(new FileReader(
            		"/Users/Bryce/CIT360/" + fileHeader + ".json"));
 
            JSONObject user1 = (JSONObject) obj;
 
            String lastName1 = (String) user1.get("lastName");
            String firstName1 = (String) user1.get("firstName");
            long age = (long) user1.get("age");
            
            
         // Prints objects datatype 
    		System.out.println("\nLast Name - [" + lastName1 + "] First Name - [" + firstName1
    							+ "] Age - [" + age + "]");
        
 
        } catch (IOException   e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    
		
		// Deserialization complete
		System.out.print("\nComplete\n");
	
		}
}