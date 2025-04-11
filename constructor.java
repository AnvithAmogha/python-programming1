class constructor
{
	int a,b;
	constructor()
	{
	}
	constructor(int x,int y)
	{
		a=x;
		b=y;
	}
	void display()
	{
		int sum=0;
		sum=a+b;
		System.out.println("sum="+sum);
	}
}
class constructor_demo
{
	public static void main(String args[])
	{
		constructor const1=new constructor();
		const1.display();
		constructor const2=new constructor(11,20);
		const2.display();
	}
}