package hw3;

public class p17
{
	public static void main(String[] args)
	{
		Carp17 car1;
		car1 = new Carp17();
		car1.setNumGas(1234, 20.5);
		int num = car1.getNum();
		double gas = car1.getGas();
		System.out.println("after the investigation we know");
		System.out.println("Car number is " + num + "volume of gas is" + gas);
	}
}

class Carp17
{
	int num;
	double gas;

	int getNum()
	{
		System.out.println("invest the car number");
		return num;
	}
	
	double getGas()
	{
		System.out.println("invest the volume of gas");
		return gas;
	}
	
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("Set volume of gas to " + this.gas + "Set car number to " + this.num);
	}
	
}










