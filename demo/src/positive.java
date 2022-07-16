import java.util.Scanner;
public class positive {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input number:");
		int input=in.nextInt();
		if(input>0)
		{
			System.out.println("number is positive");
		}
			else if(input<0) {
				System.out.println("Number is Negative");
			}
			else {
				System.out.println("Number is zero");
		}
    
	}

}
