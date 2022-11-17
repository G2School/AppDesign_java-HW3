package hw3;

public class p24
{
	public static void main(String[] args)
	{
		Carp24 car1;
		car1 = new Carp24();
		
		car1.setCar(1234,20.5);
		car1.show();
		
		System.out.println("only change the number");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("only change the volume of gas");
		car1.setCar(30.5);
		car1.show();
		
	}
}

class Carp24
{
	private int num;
	private double gas;
	
	public void setCar(int n)
	{
		num = n;
		System.out.println("set the number of car to" + num);
	}
	
	public void setCar(double g)
	{
		gas = g;
		System.out.println("set the volume of gas to" + gas);
	}
	
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("set the number of car to" + num + "set the volume of gas to" + gas);
	}
	
	void show()
	{
		System.out.println("Car number is " + this.num);
		System.out.println("vilume of gas is " + this.gas);
	}
}

