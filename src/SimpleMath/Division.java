package SimpleMath;

import VariablesDeclaration.Variables;
import java.io.*;

public class Division extends Variables{
	
	  private double division;
		
		//regular method of doing division
		public static double getDivision(double firstNumber, double secondNumber) {
			double division = firstNumber/secondNumber;
			return division; 
		}   
		
		//regular method of doing division
				public double getDivisionfromVariables(Variables thirdNumber, Variables fourthNumber) {
					 
				try {
					double division = this.thirdNumber/this.fourthNumber;
					 }
					 catch (ArithmeticException e) {
				            // Exception handler
				            System.out.println("Divided by zero operation cannot possible");
				        }
					return division; 
				}   
		
		// set value for first number and second number
		 public double setDivision(double division) {
			 division=setfirstNumber(5)/setsecondNumber(10);
		      return division;
		    }  
		 
		 // method for division of two object 
		 public double divisionOfTwoNumber(double division) {
			 Variables variables;	
			 Division divisionObject =new Division();
			 Variables object = new Variables(); 
			 division = object.getfirstNumber()/object.getsecondNumber(); 
			  return division=divisionObject.setDivision(division);
		 } 
		 
		 //incomplete
		 public String toString(Variables firstNumber,Variables secondNumber,Division division) {
			String divisionString = " " +division;
			Variables object = new Variables(); 
			return divisionString;
			 
		 }
		 
		 //it's done at divisionOfTwoNumber() method
		 public double divisionObject(double division) {
				 Variables object = new Variables();
				return division = object.getfirstNumber()/object.getsecondNumber(); 
		}   
}

