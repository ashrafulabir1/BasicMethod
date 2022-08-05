package MainMethod;

import java.util.Scanner;


import SimpleMath.Division;
import SimpleMath.Multiplication;
import SimpleMath.Subtraction;
import SimpleMath.Summation;
import VariablesDeclaration.Variables;

public class MainMethod {

	public static void main(String[] args) {
		
	    Variables variables;
	//	Summation summation;
		
		
		Variables myfirstNumber = new Variables();
		Variables mysecondNumber = new Variables();
		Variables mythirdNumber = new Variables();
		Variables myfourthNumber = new Variables();
		
		
		Summation summation = new Summation();
		Multiplication multiplication = new Multiplication();
		Division division = new Division();
		Subtraction subtraction = new Subtraction();
		
	
		
		
		//Input value of firstNumber and second Number
		    Scanner input = new Scanner(System.in);
	        System.out.print("Please enter the input of firstNumber=");
	        int a = input.nextInt();
	         myfirstNumber.setfirstNumber(a);
	         System.out.print("Please enter the input of secondNumber=");
		      int b = input.nextInt();
		      mysecondNumber.setfirstNumber(b);
		      
		      Variables c=null;
		      Variables d=null;
	         
		      
		      //Print for Summations
             System.out.println("Sum of inputted number:"+summation.getSummation(a,b)); // sum of getSummation method
             System.out.println("Sum of inputted number (2nd method):"+summation.getSummationfromVariables(c,d)); // sum of getSummationfromVariables method
             System.out.println(summation.toString()); //incomplete
             
             double valuealreadysetedforsummation=0; //initialized 
             
             System.out.println("Sum of settedValues:"+summation.summationOfTwoNumber(+valuealreadysetedforsummation)); //sum of summationOfTwoNumber() method
             
             
             
             //print for Multiplications 
             System.out.println("Multiplications of inputted numbers:"+multiplication.getMultiplication(a,b)); // Multiplication of getSummation method
             
             System.out.println(multiplication.toString()); //incomplete
             
             double valuealreadysetedformultiplication=0; //initialized 
             
             System.out.println("Multiplications of settedValues:"+multiplication.multiplicationOfTwoNumber(+valuealreadysetedformultiplication)); //Multiplication of multiplicationOfTwoNumber() method
             
          
             
             
             //print for Subtraction 
             System.out.println("Subtraction of inputted numbers:"+subtraction.getSubtraction(a,b)); // Subtraction of getSubtraction method
             
             System.out.println(subtraction.toString()); //incomplete
             
             double valuealreadysetedforsubtraction=0; //initialized 
             
             System.out.println("Subtractions of settedValues:"+subtraction.subtractionOfTwoNumber(+valuealreadysetedforsubtraction)); //Subtraction of subtractionOfTwoNumber() method
	
	
	         
             //print for Division 
             System.out.println("Divisions of inputted numbers:"+division.getDivision(a,b)); // Division of getDivision method
             
             System.out.println(division.toString()); //incomplete
             
             double valuealreadysetedfordivision=0; //initialized 
             
             System.out.println("Divisions of settedValues:"+division.divisionOfTwoNumber(+valuealreadysetedfordivision)); //Division of divisionOfTwoNumber() method
	}
}
