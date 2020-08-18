package p1;


class Laptop
{
	String brandName;
	int ramSize;
	int hdd;
	
	public void doCoding()
	{
		System.out.println(" do coding ...");
		System.out.println(" for coding we need");
		System.out.println("Ram "+ramSize);
	}
	
	public void playGames()
	{
		System.out.println(" Play Games ...");
	}
	
	public String toString()
	{
		return "***"+brandName+" "+ramSize+" "+hdd;
	}
	
}//end laptop class

public class MainClass {
	
	public static void main(String[] str) {
		
	
		Laptop hpLaptop = new Laptop();
		
		hpLaptop.brandName = "HP";
		hpLaptop.ramSize = 16;
		hpLaptop.hdd = 1000;
		
		System.out.println(hpLaptop.brandName);
		System.out.println(hpLaptop.ramSize);
		System.out.println(hpLaptop.hdd);
		System.out.println(" -------------------");
		System.out.println(hpLaptop);
		
		hpLaptop.doCoding();
		
		
	}

}











