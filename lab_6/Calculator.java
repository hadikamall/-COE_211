import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    
    public Calculator() {

   
        Scanner scanCalc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        num1 = scanCalc.nextInt();
        System.out.print("Input the second number: ");
        num2 = scanCalc.nextInt();
        scanCalc.close();
        switch(operator) {
          case "+":
            System.out.println(add(num1,num2));
            break;
          case "-":
        	  System.out.println(subtract(num1,num2));
              break;
          case "x":
        	  System.out.println(multiply(num1,num2));
              break;
          case "/":
        	  System.out.println(multiply(num1,num2));
        	  break;
        	  
          
        }
        }

    public String add(int a, int b) {
    	int result = a+b;
    	operator=" + ";
    	return a +operator+ b+" = "+ result;
    }

    public String subtract(int a, int b) {
    	int result = a-b;
    	operator=" - ";
    	return a +operator+ b+" = "+ result;
    }

    public String multiply(int a, int b) {
    	int result = a*b;
    	operator=" * ";
    	return a+operator+b+" = "+ result;
    }

    public String divide(int a, int b) {
       int result=a/b;
       operator=" / ";
       return a+operator+b+" = "+ result;		
    }
}