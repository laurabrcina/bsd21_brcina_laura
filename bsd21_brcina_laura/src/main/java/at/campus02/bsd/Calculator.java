package at.campus02.bsd;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

       System.out.println("Enter two numbers");
       double number1 = scanner.nextDouble();
       double number2 = scanner.nextDouble();

       System.out.println(add(number1,number2));
       System.out.println(minus(number1,number2));
       System.out.println(divide(number1,number2));
       System.out.println(multiply(number1,number2));
    }

    public static double add(double number1, double number2){
        double sum;
        sum = number1 + number2;
        return sum;
    }

    public static double minus(double number1, double number2){
        double sum;
        sum=number1 - number2;
        return sum;
    }

    public static double divide(double number1, double number2){
        double sum;
        sum=number1 / number2;
        return sum;
    }

    public static double multiply(double number1, double number2){
        double sum;
        sum=number1 * number2;
        return sum;
    }

}
