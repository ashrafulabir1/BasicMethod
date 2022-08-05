package SimpleMath;

import VariablesDeclaration.Variables;

public class Multiplication extends Variables{
	
		    
		  private double multiplication;
			
			//regular method of doing Multiplication
			public static double getMultiplication(double firstNumber, double secondNumber) {
				double multiplication = firstNumber*secondNumber;
				return multiplication; 
			}   
			
			// set value for first number and second number
			 public double setMultiplication(double multiplication) {
				 multiplication=setfirstNumber(5)*setsecondNumber(10);
			      return multiplication;
			    }  
			 
			 // method for multiplication of two object 
			 public double multiplicationOfTwoNumber(double multiplication) {
				 Variables variables;	
				 Multiplication multiplicationObject =new Multiplication();
				 Variables object = new Variables(); 
				 multiplication = object.getfirstNumber()*object.getsecondNumber(); 
				  return multiplication=multiplicationObject.setMultiplication(multiplication);
			 } 
			 
			 //incomplete
			 public String toString(Variables firstNumber,Variables secondNumber,Multiplication multiplication) {
				String multiplicationString = " " +multiplication;
				Variables object = new Variables(); 
				return multiplicationString;
				 
			 }
			 
			 //it's done at summationOfTwoNumber() method
			 public double multiplicationObject(double multiplication) {
					 Variables object = new Variables();
					return multiplication = object.getfirstNumber()*object.getsecondNumber(); 
			}   
		
}
