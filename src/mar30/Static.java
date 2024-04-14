package mar30;

public class Static {
	//global static variable
	static int a,b,c;
	public static void mul()
	{
		a=8;
		b=9;
		c=a*b;
	
		
		System.out.println(c);
	}

	public static void sub()
	{
		a=8957;
		b=25;
		c=a-b;
		System.out.println(c);
	}	
	public static void main(String[] args) {
		//call static methods with classname
		Static.mul();// calling with class name starting
		sub();// starting or called with only method name 

	}

}
