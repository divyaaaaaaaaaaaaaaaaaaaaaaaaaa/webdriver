package mar30;

public class Nonstatic {
	int x,y,z;
	public void add()
	{
		x=8766;
		y=259;
		z=x+y;
		System.out.println(z);
	}
	public void division()
	{
		x=6;
		y=2;
		z=x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		//create reference object to call non static methods which we have creatd in public class
		Nonstatic a = new Nonstatic();
		a.division();
		a.add();
	}

}