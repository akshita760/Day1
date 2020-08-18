package p1;

class Demo
{
	
	public void doStuff(int x) // 4
	{
		System.out.println("int");
	}
	
	public void doStuff(short y) // 1
	{
		System.out.println("short");
	}
}


public class OverloadingDemo {
	
	public static void main(String[] args) {
		
		
		Demo demo = new Demo();
		short b = 11;  // 2
		demo.doStuff(b);
	}

}
