import java.util.Scanner;  
  
public class LineComparisonComputation { 
	public static void line(double x1,double x2,double y1,double y2) {
		
		double result= Math.sqrt( ((x2-x1)*(x2-x1))-((y2-y1)*(y2-y1)) );
	    System.out.println("length of line = "+result);
		
	}
  
   public static void main(String[] args) {  
	   
	   Scanner x1 = new Scanner(System.in);  
       System.out.print("Enter a number x1: ");  
       int n1 = x1.nextInt(); 
       
       Scanner x2 = new Scanner(System.in);  
       System.out.print("Enter a number x2: ");  
       int n2 = x2.nextInt(); 
       
       Scanner y1 = new Scanner(System.in);  
       System.out.print("Enter a number y1: ");  
       int n3 = y1.nextInt(); 
       
       Scanner y2 = new Scanner(System.in);  
       System.out.print("Enter a number y2: ");  
       int n4 = y2.nextInt(); 
       
       line(n1,n2,n3,n4);
   }
}  
