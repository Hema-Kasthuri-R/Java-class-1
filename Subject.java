public class Subject{

     public static void main(String []args){
        double lan = 35.00;
        double eng = 85.00;
        double mat = 95.00;
        double sci = 45.00;
        double soc = 65.00;
        double total = (lan+eng+mat+sci+soc)/5;
        if(total>50.00)
        {
          System.out.println("Pass");  
        }
        else{
        System.out.println("Fail");
        }
     }
}
