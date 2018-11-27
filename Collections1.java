import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create temporary score holders
				float t1 = 0;
				float t2 = 0;
				float t3 = 0;
				float t4 = 0;
				float t5 = 0;
				float t6 = 0;
				float t7 = 0;
				float t8 = 0;
				float t9 = 0;
				float t10 = 0;
				// Create the scanner for input.
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				
				// Prompt for input
				System.out.print("Please enter numbers\n");
				System.out.print("Number 1: ");
				t1 = input.nextFloat();
				System.out.print("Number 2: ");
				t2 = input.nextFloat();
				System.out.print("Number 3: ");
				t3 = input.nextFloat();
				System.out.print("Number 4: ");
				t4 = input.nextFloat();
				System.out.print("number 5: ");
				t5 = input.nextFloat();

				// Create our list we are going to use
				List<Float> tempList = new ArrayList<Float>();
				
				// Add the temporary Number holders into the list we made
				tempList.add(t1);
				tempList.add(t2);
				tempList.add(t3);
				tempList.add(t4);
				tempList.add(t5);
				
				// Display to the user the Scores they provided
				System.out.print("\nHere are the numbers you entered in: ");
				System.out.println(tempList + "\n");
				
				
				//sort the list in ascending order
				Collections.sort(tempList);
				System.out.println("Numbers from Lowest to Highest: " + tempList + "\n");
				
				//shuffle the list so its random again
				Collections.shuffle(tempList);
				System.out.println("Randomized Numbers: " + tempList + "\n");
				
				
				//searching the list
				// We need to sort before we search it. 
				Collections.sort(tempList);
				
				// Prompt for a Score
				float numberLookup = 0;
				System.out.println("Number lookup: ");
				numberLookup = input.nextFloat();
				
				// Search the list for the provided Score to lookup and report back
				int search = Collections.binarySearch(tempList, numberLookup);
				
				// If the search worked look for positive number, else negative = fail
				if(search >= 0){
					System.out.println("Score found. [" + numberLookup + "]\n");
				}
				else{
				    System.out.println("Score not found. [" + numberLookup + "]\n");
				}
				
				//Get the min temp from the list
				Float minimum = Collections.min(tempList);
				System.out.println("Minimum Number is: [" + minimum + "]\n");
				
				//Get the max temp from the list
				Float maximum = Collections.max(tempList);
				System.out.println("Maximum Number is: [" + maximum + "]\n");
				
				//Reverse the list around
				System.out.println("List Before - Current List: " + tempList);
				Collections.reverse(tempList);
				System.out.println("List After - Reversed List: " + tempList + "\n");
				
				//Add 5 more scores to our list
						System.out.print("Number 6: ");
						t6 = input.nextFloat();
						System.out.print("Number 7: ");
						t7 = input.nextFloat();
						System.out.print("Number 8: ");
						t8 = input.nextFloat();
						System.out.print("Number 9: ");
						t9 = input.nextFloat();
						System.out.print("Number 10: ");
						t10 = input.nextFloat();
						
				//save scores
				tempList.add(t6);
				tempList.add(t7);
				tempList.add(t8);
				tempList.add(t9);
				tempList.add(t10);
						
				//Show values
				System.out.print("\nHere are the numbers you entered in: ");
				System.out.println(tempList + "\n");
				
				//filling the list 
				float zeroOut = 0;
				Collections.fill(tempList, zeroOut);
				System.out.println("Cleared list: "+ tempList);
						
				
				// End
				System.out.println("Thank you for your participation.");
			}

}