package SimpleMath;

import VariablesDeclaration.Variables;

public class Summation extends Variables {
	
	private double summation;
	
	//regular method of doing summation
	public static double getSummation(double firstNumber, double secondNumber) {
		double summation = firstNumber+secondNumber;
		return summation; 
	}   
	
	//regular method of doing summation
	public double getSummationfromVariables(Variables thirdNumber, Variables fourthNumber) {
		double summation = this.thirdNumber+this.fourthNumber;
		return summation; 
	}  
	
	// set value for first number and second number
	 public double setSummation(double summation) {
		 summation=setfirstNumber(5)+setsecondNumber(10);
	      return summation;
	    }  
	 
	 // method for sum of two object 
	 public double summationOfTwoNumber(double summation) {
		 Variables variables;	
		 Summation summationObject =new Summation();
		 Variables object = new Variables(); 
		 summation = object.getfirstNumber()+object.getsecondNumber(); 
		  return summation=summationObject.setSummation(summation);
	 } 
	 
	 //incomplete
	 public String toString(Variables firstNumber,Variables secondNumber,Summation summation) {
		String summationString = " " +summation;
		Variables object = new Variables(); 
		return summationString;
		 
	 }
	 
	 //it's done at summationOfTwoNumber() method
	 public double summationObject(double summation) {
			 Variables object = new Variables();
			return summation = object.getfirstNumber()+object.getsecondNumber(); 
		}   
}
