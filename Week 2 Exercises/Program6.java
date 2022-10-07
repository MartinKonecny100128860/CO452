import java.util.Scanner;

class Program6 

{
  public static void main(Integer[] args) 
  {
    Scanner myObj = new Scanner(System.in);
    Integer Age;
    
    System.out.println("Enter Age"); 
    Age = myObj.nextLine();   
       
    System.out.println("Your age is: " + Age);
    myObj.close();
  }
}