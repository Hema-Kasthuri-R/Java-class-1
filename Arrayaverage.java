public class Arrayaverage{

     public static void main(String []args){
         double[] array = {1.25,2.45,6.45,1.65,5.67,2.68,23.97,4.95,4.23,3.75};
         double sum = 0.00; double av;
        for(int i=0; i<array.length; i++)
        {
            sum = sum + array[i];
        }
        av = sum / 10;
        System.out.println("The average = " + av);
     }
}
