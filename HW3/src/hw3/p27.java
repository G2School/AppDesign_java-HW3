package hw3;

public class p27
{
	public static void main(String[] args)
	{
		Carp27 car1;
		car1 = new Carp27();
		car1.show();
		
		Carp27 car2;
		car2 = new Carp27(1234, 25.0);
		car2.show();
		
	}
}

class Carp27
{
	private int num;
	private double gas;
	
	public Carp27()
	{
		num = 0;
		gas = 0.0;
		System.out.println("produce the car");
	}
	
	public Carp27(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("produce the carwhich car number is " + n + ",volume of gas is " + g);
	}
	
	
	void show()
	{
		System.out.println("Car number is " + this.num);
		System.out.println("volume of gas is " + this.gas);
	}
}

