 
public class LineComparisonComputation { 
	static double temp = 0.0;

	public static double line(double x1,double x2,double y1,double y2) {
		
		double result= Math.sqrt( ((x2-x1)*(x2-x1))-((y2-y1)*(y2-y1)) );
	    System.out.println("\nlength of line = "+result);
	    return result;
		
	}
	public static void CompareTo(double result1,double result) {

		if(result1==result) {
			System.out.println("\nlines is of equal length");
		}
		else if(result1<result) {
			System.out.println("\nlength of line1<line2");
		}
		else if(result1>result) {
			System.out.println("\nlength of line1>line2");
		}
	}
  
   public static void main(String[] args) {  
	  LineComparisonComputation L1 = new  LineComparisonComputation();
	  System.out.println("\nline1 = x1: "+10+",x2: "+5+",y1: "+10+",y2: "+6);
	 double v1= L1.line(10, 5, 10, 6);
	  System.out.println("\nline2 = x1: "+10+",x2: "+5+",y1: "+10+",y2: "+7);
	  double v2 =L1.line(10, 5, 10, 7);
	  CompareTo(v1,v2);
       
	   }
      
      
	  
   }
 
