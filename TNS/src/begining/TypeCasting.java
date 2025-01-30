package begining;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//widening is a implicit type casting 
		
		byte b=10;
		int l=b;
		System.out.println(l);
		
		float f=100/3f;
		double d=f;
		System.out.println(d);
		
		char ch='A';
		int i=ch;
		System.out.println(i);  // it is called explicit typecasting or widening
		
		double l1=10.52f; //byte in decimal
		long lo=(long)l1;    //syntax for narrowing typecasting
		System.out.println(lo);
		
		int xy=130;
		byte bi=(byte) xy;
		System.out.println(bi);
		
		
		
	}

}
