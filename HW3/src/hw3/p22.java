package hw3;

public class p22
{
	public static void main(String[] args)
	{
		Carp22 car1;
		car1 = new Carp22();
		
		car1.setNumGas(1234,20.5);
		car1.show();
		
		System.out.println("try to set the incorrect volume of gas( -10 )");
		
		car1.setNumGas(1234, -10.0);
		car1.show();
	}
}

class Carp22
{
	private int num;
	private double gas;
	
	public void setNumGas(int n, double g)
	{
		if(g > 0 && g < 100)
		{
			num = n;
			gas = g;
			System.out.println("set the number of car to" + num + "set the volume of gas to" + gas);
		}
		else
		{
			System.out.println(g + " : incorrect volume of gas");
			System.out.println("cannot change the volume of gas");
		}
	}
	
	void show()
	{
		System.out.println("Car number is " + this.num);
		System.out.println("vilume of gas is " + this.gas);
	}
}

