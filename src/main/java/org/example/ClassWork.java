package org.example;

public class ClassWork {
    public static void main (String[] args){
        printSmthg();
        printArgumentValueIntoConsole("hello");
        double number = claculateSomeExpression(0.25 , 0.3);
    }




    public static void printSmthg(){
        System.out.println("Something");

     }

     public static void printArgumentValueIntoConsole(String word){
        System.out.printf("Ur argument was: %s\n", word);
     }

   public static double claculateSomeExpression(double firstValue, double secondValue){
        double result = firstValue/secondValue;
        System.out.println("Calculating");
       //System.out.println("firstValue: " + firstValue + ";secondValue: " + secondValue + "result is: " + result);
       //System.out.printf("FirstValue: %f; secondValue: %f; result: %f");
       String s = String.format("FirstValue: %f; secondValue: %f; result: %f");
       return result;
    }

}
