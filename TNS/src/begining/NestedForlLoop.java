package begining;
import java.util.*;


public class NestedForlLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a=10;

		int b=20;
		System.out.println();
//
//		for(int i=a; i<=b;i++) {
//			
//			for(int j=1; j<=10; j++) {
//				System.out.println(i + "*" + j + "=" + i*j);
//			}
//			System.out.println();
//		}
//	}
//		for(int i=5;i<=10;i++) {
//			if(i==6) 
//				break;
//			System.out.println(i);
//			System.out.println("HELLO");
//			}
		
		for(int i=5;i<=15;i++) {
			if(i%2 !=0) //condition for even nos
				continue;
			System.out.println(i);}
	char x='x';
	switch (x) {
	case 'a': 
		System.out.println("a is printed");
		
		
		break;
	
	default:
		System.err.println("Invalid input");
	}
		
		
		
		
		
		
}}
