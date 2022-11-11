package Week3;
import java.util.Scanner;
public class W3P1 {
	private static final String B = null;

    public static void main(String[] args) 
	{

        System.out.println("Enter your Grade:");

	    Scanner sc = new Scanner(System.in) 
        String grade = sc.nextLine();
                	 
        	if(grade == "A") 
            {
        		System.out.println("This is 1st You passed");
        	} 
            if(grade == "B") 
            {
        		System.out.println("This is 2:1 You passed");
        	} 
            if(grade == "C") {
        		System.out.println("This is 2:2 You passed");
        	} 
            if(grade == "D") {
        		System.out.println("TYou have passed");
        	} 
            if(grade == "F") {
        		System.out.println("You have failed");
        	} 
        	 
    }
	}

