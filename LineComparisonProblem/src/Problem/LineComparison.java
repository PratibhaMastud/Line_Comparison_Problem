	package Problem;
	
	import java.util.Scanner;
	
	public class LineComparison {
	
		public static void main(String[] args) {
	
			int firstX,firstY,secondX,secondY; 
		    double lengthOfLine;
	
		    Scanner userInput=new Scanner(System.in);
	
		    System.out.println("Enter the length of X1");
	
		    firstX=userInput.nextInt();
	
		    System.out.println("Enter the length of Y1");
	
		    firstY=userInput.nextInt();
	
		    System.out.println("Enter the length of Y2");
	
		    secondY=userInput.nextInt();
	  
		    System.out.println("Enter the length of X2");
	
	        secondX=userInput.nextInt();
	
	        lengthOfLine=Math.sqrt((secondX-firstX)^2+(secondY-firstY)^2);
	
	        System.out.println("length of line is : "+ lengthOfLine);
		}
	
	}
