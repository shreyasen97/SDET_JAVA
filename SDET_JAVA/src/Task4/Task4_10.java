package Task4;
import java.util.Scanner;
import java.lang.Math;
public class Task4_10 {

	public static void main(String[] args) {
		int T;
		double x;
		double a[]=new double[100];
		System.out.println("Enter the number of test cases\n");
		Scanner input=new Scanner(System.in);
		T=input.nextInt();
		System.out.println("Enter the values\n");
		for(int i=0;i<T;i++)
		{
			a[i]=input.nextDouble();
		}
		
		for(int i=0;i<T;i++)
		{
			x=a[i]%(Math.pow(10, 9)+7);
			System.out.println(x);
		}

	}

}
