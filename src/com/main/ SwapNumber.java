 c. Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
     		   --> One Function should swap the numbers without any third new variable.
      		 --> Second function should swap the numbers using a third variable.
      		 
     public class SwapNumber{
     
        public static void swapNoWithTemp(int a, int b){
             System.out.println("before the swap");
             System.out.println("value of a="+a);
             System.out.println("value of b="+b);
            
              int temp = a;
              a = b;
              b = temp;
             System.out.println("after the swap");     
            System.out.println("value of a="+a);
             System.out.println("value of b="+b);
             }
        public static void swapNoWithoutTemp(int a, int b){
             
             System.out.println("before the swap");
             System.out.println("value of a="+a);
             System.out.println("value of b="+b);
             a = a+b;
             b = a-b;
             a = a-b;
            System.out.println("after the swap");     
            System.out.println("value of a="+a);
             System.out.println("value of b="+b);
             }
             
        public static void main(String [] args){
                SwapNumber sn = new SwapNumber();
                sn.swapNoWithTemp(10,15);
                sn.swapNoWithoutTemp(10,15);
                }
                }
