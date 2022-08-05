package VariablesDeclaration;

import MainMethod.MainMethod;

public class Variables extends MainMethod{
   
	private double firstNumber;
    private double secondNumber;
    protected double thirdNumber;
    protected double fourthNumber;

    public double getfirstNumber() { 
    	return firstNumber; 
    	}
   
    public double getsecondNumber() { 
    	return secondNumber; 
    	}
    
    public double setfirstNumber(double x)
    {
        return this.firstNumber = x;
    }
    
    public double setsecondNumber(double y)
    {
       return this.secondNumber = y;
    }
    
    public String firstNumbertoString(){
    	String firstNumbertoString = Double.toString(firstNumber);
    	return firstNumbertoString;
    }
    
    public String secondNumbertoString(){
    	String secondNumbertoString = Double.toString(secondNumber);
    	return secondNumbertoString;
    }
}