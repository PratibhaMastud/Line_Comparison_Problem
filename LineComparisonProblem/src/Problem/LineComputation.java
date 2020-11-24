	package Problem;

import java.util.Random;

public class LineComputation {
		
			Double[] lengths = new Double[2]; 
		
			double firstLine,secondLine;
			
			int firstX,firstY,secondX,secondY,thirdX,thirdY,fourthX,fourthY; 

			
			void calculateLengthOfLine() {
						    
			Random userEnterValue = new Random();
						    
			firstX=userEnterValue.nextInt(10) + 1;
		
		    firstY=userEnterValue.nextInt(10) + 1;
		
		    secondX=userEnterValue.nextInt(10) + 1;
	  	
		    secondY=userEnterValue.nextInt(10) + 1;
	        	    	
		    thirdX=userEnterValue.nextInt(10) + 1;
		
		    thirdY=userEnterValue.nextInt(10) + 1;
		
		    fourthX=userEnterValue.nextInt(10) + 1;
	  	
		    fourthY=userEnterValue.nextInt(10) + 1;
	
	        firstLine = Math.sqrt( ((secondX - firstX) * (secondX - firstX))  + ((secondY - firstY) * (secondY - firstY)));
	        
	        secondLine = Math.sqrt( ((fourthX - thirdX) * (fourthX - thirdX)) + ((fourthY - thirdY) * (fourthY - thirdY)));
			
	        
	        lengths[0] = (double)firstLine;
	        
	        lengths[1] = (double)secondLine;
	        
	        Double line1 = lengths[0];
	        
	        Double line2 = lengths[1];
	      	  
	        System.out.println("Line1 length : "+lengths[0]+" Line1 length : "+lengths[1]);
		    if (line1.equals(line2) == true) {
		    	
		    	System.out.println("_____________________________________________________________________________");
				System.out.println("Lines are equal to Length");
			
		    }else
		    
		    	System.out.println("_____________________________________________________________________________");
				System.out.println("Lines are not equal to Length");	
			}	
	        
			
			
			public static void main(String[] args) {
					
				LineComputation lineComparison = new LineComputation();
				
				lineComparison.calculateLengthOfLine();
				
		}
	
	}
