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
		    
	        int compare = line1.compareTo(line2);
	        
	       if ( compare == 0 )

	    	   System.out.println("Both lines have Equal length");
			  
	       else if( compare > 0 )
			
	    	   System.out.println("Line1 is greater than Line2");
	       else
	    	   System.out.println("Line2 is greater than Line1");
			}
			
			public static void main(String[] args) {
					
				LineComputation lineComparison = new LineComputation();
				
				lineComparison.calculateLengthOfLine();
				
		}
	
	}
