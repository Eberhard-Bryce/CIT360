package Thread;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Thread implements Runnable {
    
    // Declare attributes
    int begin;
    int end;
    String file;
    
    
   // Constructor Method
    public Thread(int start, int stop, String filename) {
        begin = start;
        end = stop;
        file = filename;
    }
    
    
    @Override
    public void run() {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = begin; i <= end; i+=2) {
            if (prime(i)) {
                primes.add(i);
            }
        }
        try (PrintWriter print = new PrintWriter(new File(file))) {
            for (Integer prime : primes) {
                print.println(prime);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    
    public static boolean prime(int toTest) {
        if (toTest == 2) {
            return true;
        }
        for (int n = 3; n < toTest; n+=2) {
            if (toTest%n==0) {
                return false;
            }
        }
        return true;
    }
}
