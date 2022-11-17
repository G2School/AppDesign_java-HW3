package hw3;

public class p7 
{
	public static void main(String[] args)
	{
		Carp7 car1;
		car1 = new Carp7();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		Carp7 car2;
		car2 = new Carp7();
		
		car2.num = 2345;
		car2.gas = 30.5;
		
		System.out.println("car1's Car number is " + car1.num);
		System.out.println("car1's volume of gas is " + car1.gas);
		
		System.out.println("car2's Car number is " + car2.num);
		System.out.println("car2's volume of gas is " + car2.gas);
	}
}

class Carp7
{
	int num;
	double gas;
}
