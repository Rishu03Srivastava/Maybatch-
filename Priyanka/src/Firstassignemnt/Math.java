package Firstassignemnt;

public class Math {
	
	public void Add(int a, int b)
	{
		int c;
		c= a+b;
		System.out.println("Addition " +c);
	}

	public void Sub(int a1, int b1)
	{
		int c1;
		c1= a1-b1;
		System.out.println("Addition " +c1);
	}
	
	public void Div(float a2, float b2)
	{
		float c2;
		c2= a2/b2;
		System.out.println("Addition " +c2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Math on = new Math();
		on.Add(5, 4);
		on.Sub(5, 4);
		on.Div(5, 4);
	}

}
