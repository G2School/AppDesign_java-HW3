package hw3;

public class p14
{
	public static void main(String[] args)
	{
		Carp14 car1;
		car1 = new Carp14();
		
		car1.setNum(1234);
		car1.setGas(20.5);
		
	}
}

class Carp14
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		System.out.println("Set the car number to " + num);
		
	}
	
	void setGas(double g)
	{
		gas = g;
		System.out.println("Set the volume of gas to " + gas);
		
	}
	
}










