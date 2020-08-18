package p2;

public class MainClass {

	public static void main(String[] args) {
		
		Computer computer = new Laptop();

		computer.doCoding();// 1.
		
		//Laptop laptop = new Laptop();
		//laptop.doGaming();
		
		Laptop laptop = (Laptop)computer;
		laptop.doGaming();
		
		//--------------------------
		
		
		int s = 10;
		short x = (short)s;
		
		
	}
}
