e. Write a program  to check if a given number is prime or not.

public class Prime{

 public static void main(String [] args){
 
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number=");
     int number = sc.nextInt();
      for(int i= 2; i<=number%2;i++){
           if(number%i==0){
              System.out.println("The number is not prime"+ number);
              }
           else {
              System.out.println("The number is prime"+number);
              }
              }
              }
              }
