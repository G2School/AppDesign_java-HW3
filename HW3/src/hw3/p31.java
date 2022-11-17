package hw3;

public class p31
{
	public static void main(String[] args)
	{
		Carp31.showSum();
		
		Carp31 car1;
		car1 = new Carp31(5678, 30.5);
		car1.show();
		
		Carp31.showSum();

		Carp31 car2;
		car2 = new Carp31(1234, 25.0);
		car2.show();
		
	}
}

class Carp31
{
	public static int sum = 0;
	private int num;
	private double gas;
	
	public Carp31(int n, double g)
	{
		num = n;
		gas = g;
		sum ++;
		System.out.println("produce the car");
	}
	
	public static void showSum()
	{
		System.out.println("total " + sum + " car(s)");
	}
	
	
	void show()
	{
		System.out.println("Car number is " + this.num);
		System.out.println("volume of gas is " + this.gas);
	}
}

