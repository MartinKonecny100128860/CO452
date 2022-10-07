package Week3;
import java.util.Scanner;  
public class Program61 {
	public static void main(String[] args) 
	{
        
     System.out.println("Enter your age:");

	 try (Scanner sc = new Scanner(System.in)) {
        int age = sc.nextInt();
        
        	 
        	if(age > 17) {
        		System.out.println("Welcome!");
        	} else {
        		System.out.println("Too Young");
        		}
        	 
    }
	}
}