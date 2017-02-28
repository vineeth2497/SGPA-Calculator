import java.util.Scanner;


public class sgpa {
public static void main(String[] args){
	System.out.println("Welcome To The SGPA Calculator");
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter The Number OF Credit Elements");
	int x = scanner.nextInt();
	double sum =0;
	System.out.println("Enter the Credit Points");
	int[] arr =new int[x];
	  for(int i=0;i<x;i++){
		  int y = scanner.nextInt();
		  arr[i]= y;
		  sum += arr[i];
	  }
	System.out.println("Enter The Credit points Earned");
	double z = scanner.nextDouble();
	double sgpa =(sum/z);
	System.out.println("your SGPA Is "+sgpa);

}
} 
