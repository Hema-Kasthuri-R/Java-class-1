public class Fibonacci{

     public static void main(String []args){
        long a = 0;
        long b = 1;
        long c,i;
        long count = 50;
         System.out.print(a + "," + b);
         for (i = 2 ; i <= count; i++)
         {
             c = a+b;
              System.out.print("," + c);
              a=b;
              b=c;
         }
     }
}
