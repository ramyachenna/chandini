a. Write a program that prints a fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8.You can vary the number of elements to be printed meaning you can print 10 numbers or 15 or 20 or any desired number.

public class Fibonocci{

public static void main(String [] args){

      int [] arr = new int[20];
      for(int i=2;i<20;i++){
          arr[i] = arr[i-2] + arr[i-1];
          System.out.println("The Fibonocci numbers is="+arr[i]);
          }
          }
          }
