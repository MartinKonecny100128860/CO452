package Week3;
import java.util.Scanner;  
public class Program6 {
	public static void main(String[] args) 
	{

  System.out.println("Enter your age:");

	try (Scanner sc = new Scanner(System.in)) {
        int age = sc.nextInt();
 
        	if(age > 1) {
        			System.out.println("You age is:" + age);
        	}
        	
    }
	}
}