import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    try (Scanner myObj = new Scanner(System.in)) {
      System.out.println("Enter length of rectangle");
      int length = myObj.nextInt();
      System.out.println("Enter height of rectangle"); 
      int height = myObj.nextInt();

      System.out.println("Area= " + length*height);
    } 
  }  
}