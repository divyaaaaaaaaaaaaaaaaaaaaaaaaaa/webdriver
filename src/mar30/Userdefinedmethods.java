package mar30;

public class Userdefinedmethods {
public static void adddition(int a,int b)
{
int c = a+b	;
System.out.println(c);
}
public static String verify_String(String str1,String str2)
{
	String res;
	if(str1.equalsIgnoreCase(str2))
	{
		res="Both strings are equal";
	}
	else
	{
	res="Both strings are not equal";	
	}
	return res;
	}
public static boolean compare_value(int x,int y)
{
if (x==y)
{
return true;
}
else 
{
	return false;	
}
}
public static void main(String[] args) {
	Userdefinedmethods.adddition(1234, 456);//there is no need of data type stored becuase it is not a return type its a void type
	String a =Userdefinedmethods.verify_String("hello", "hello");
	System.out.println(a);//here string is stored because its a datatpe to return any value
	boolean x = Userdefinedmethods.compare_value(100, 300);
	System.out.println(x);//boolean is stored because its a datatpe to return any value
	
	}

}
