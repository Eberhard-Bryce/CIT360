package Thread;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadExecute {

		public static final int count = 3 ;
	    public static final int start = 1;
	    public static final int stop = 1000000;
	    public static ExecutorService executorService = Executors.newFixedThreadPool(count);
	    
	    public static void main(String[] args) {
	    	
	    	long startTime = System.currentTimeMillis(); 
	     
	        
	        ArrayList<Integer> primes = new ArrayList<>();
	        int incrementAmount = stop/count;
	        
	       
	        System.out.println("Creating the threads");
	        
	        
	        for (int i = 0; i < count; i++) {
	            executorService.submit(new Thread((start + (i * incrementAmount)), (start + (i * incrementAmount) + incrementAmount), i + ".txt"));
	        }
	        
	         System.out.println("Threads have been created");
	        
	        
	        executorService.shutdown();
	        
	        
	        while (!executorService.isTerminated()) { }
	        
	        
	        System.out.println("creating an array of threads");
	        for (int i = 0; i < count; i++) {
	            File f = new File(i + ".txt");
	            try (Scanner scan = new Scanner(new File(i+".txt"))) {
	                while (scan.hasNextInt()) {
	                    primes.add(scan.nextInt());
	                }
	            } catch (FileNotFoundException ex) {
	                Logger.getLogger(ThreadExecute.class.getName()).log(Level.SEVERE, null, ex);
	            }
	            f.delete();
	        }
	        
	        
	        try (PrintWriter print = new PrintWriter(new File("primes.txt"))) {
	            for (Integer prime : primes) {
	                print.println(prime);
	            }
	        } catch (Exception e) {
	            e.getMessage();
	        }
	        
	        
	        System.out.println("Array Completed");
	        
	        
	        
	        long finish = System.currentTimeMillis();
	        System.out.println("Total time spent: " + (finish - startTime)/1000 + " seconds");
	    }
	}