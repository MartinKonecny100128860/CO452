import java.util.Scanner;  
public class Program6 {
	public static void main(String[] args) 
	{
	try (Scanner sc = new Scanner(System.in)) {
        int age = sc.nextInt();
        
        System.out.println("Enter your age:" + age);
        
        	if(age > 0) {
        		if(age > 18) {
        			System.out.println("Welcome!");
        		} else {
        			System.out.println("Too Young");
        		}
        	} else {
        		System.out.println("Error");
        	}
    }
	}
}