package hw3;

public class p15
{
	public static void main(String[] args)
	{
		Carp15 car1;
		car1 = new Carp15();
		
		int num = 1234;
		double gas = 20.5;
		
		car1.setNumGas(num, gas);
		
	}
}

class Carp15
{
	int num;
	double gas;
	
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("Set volume of gas to " + this.gas + "Set car number to " + this.num);
	}
	
	void showCar()
	{
		System.out.println("Car number is " + this.num);
		System.out.println("vilume of gas is " + this.gas);
	}
	
}










