package SimpleMath;

import VariablesDeclaration.Variables;

public class Subtraction extends Variables {
	
	  private double substraction;
		
			//regular method of doing subtraction
			public double getSubtraction(double firstNumber, double secondNumber) {
				   double subtraction = firstNumber-secondNumber;
				   return subtraction; 
			}   
			
			
			//regular method of doing division
					public double getSubstractionfromVariables(Variables thirdNumber, Variables fourthNumber) {
						double substraction = this.thirdNumber-this.fourthNumber;
						return substraction; 
					}     
			
			// set value for first number and second number
			 public double setSubtraction(double subtraction) {
				    subtraction=setfirstNumber(5)-setsecondNumber(10);
			        return subtraction;
			 }  
			 
			 // method for subtraction of two object 
			 public double subtractionOfTwoNumber(double subtraction) {
				    Variables variables;	
				    Subtraction subtractionObject =new Subtraction();
				    Variables object = new Variables(); 
				    subtraction = object.getfirstNumber()-object.getsecondNumber(); 
				    return subtraction = subtractionObject.setSubtraction(subtraction);
			 } 
			 
			 //incomplete
			 public String toString(Variables firstNumber,Variables secondNumber,Subtraction subtraction) {
				    String subtractionString = " " +subtraction;
				    Variables object = new Variables(); 
				    return subtractionString;
				 
			 }
			 
			 //it's done at subtractionOfTwoNumber() method
			 public double subtractionObject(double subtraction) {
					 Variables object = new Variables();
					 return subtraction = object.getfirstNumber()-object.getsecondNumber(); 
			}   
}	

