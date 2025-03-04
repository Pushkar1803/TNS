package strings;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		StringBuffer buffer=new StringBuffer("Hello");
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		//appending and inserting
		String string;
		int a=42;
		buffer=new StringBuffer(40);
		string=buffer.append("a= ").append(a).append("!").toString();
		System.out.println(string);
		
		System.out.println(buffer);
	buffer=new StringBuffer("I java!");
	buffer.insert(2, " Like ");
	
	System.out.println(buffer);
	
	buffer.delete(3, 6);
	System.out.println(buffer.reverse());
	
	
	}

}
