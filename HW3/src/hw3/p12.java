package hw3;

public class p12
{
	public static void main(String[] args)
	{
		Carp12 car1;
		car1 = new Carp12();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showCar();
		
	}
}

class Carp12
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("Car number is " + this.num);
		System.out.println("vilume of gas is " + this.gas);
	}
	
	void showCar()
	{
		System.out.println("Start showing info of the car");
		this.show();
	}
	
}










