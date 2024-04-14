package mar29;

public class Trycatch {

	public static void main(String[] args) {
		//divide zero with any value
		try {
			int x= 987,y=0,z;
		z=x/y;
		System.out.println(z);
} catch (Throwable t)
		{
			System.out.println(t.getMessage());
		}
		int a=4566,b=56,c;
		c=a/b;
		System.out.println(c);

	}

}
