package hw3;

public class p26
{
	public static void main(String[] args)
	{
		Carp26 car1;
		car1 = new Carp26();
		
		car1.show();
		
	}
}

class Carp26
{
	private int num;
	private double gas;
	
	public Carp26()
	{
		num = 0;
		gas = 0.0;
		System.out.println("produce the car");
	}
	
	void show()
	{
		System.out.println("Car number is " + this.num);
		System.out.println("volume of gas is " + this.gas);
	}
}

