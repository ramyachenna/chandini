d. Write a program  to calculate factorial of a given number. You need to compute the factorial with one logic that uses recursion and another logic without recursion.

//method with recursion
public class Factorial{

   public static void main(String [] Args){
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int factorial = fact(num);
        System.out.println("The factorial numbers are="+factorial);
        }
    public static int fact(int a){
        if(a==1){
          return 1;
          }
        int output =  fact(a-1) * a;
        return output;
        }
        }

// another method without recursion with for loop        
    
    public class Factorial{
    public static void main(String [] args){
    
     	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the factorial values=");
		int factvalue = sc.nextInt();
		
		int fact = 1;
		for(int i=1; i<10; i++){
				fact = fact * i;
				}
		System.out.println("The factorial numbers are ="+ fact);
	}
  }      
