import java.io.*;
public class Positiveornegative {

	public static void main(String[] args) throws IOException{
     BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
     double a;
     System.out.println("Enter the value of the number:");
     a=Double.parseDouble(in.readLine());
     if(a<0)
    	 System.out.println("Negative");
     else
    	 System.out.println("Positive");
     }

}
