package helloworld;

interface NewyearGift
{
	public void display();
}
class Chocolates implements NewyearGift
{
	int cnt;
	String ch_name;
	public Chocolates(int n, String str)
	{
		cnt=n;
		ch_name=str;
	}
	public void display()
	{
		System.out.println("No of Chocolates: " + cnt);
		System.out.println("Name of Chocolate: " + ch_name);
	}
}
class Sweets implements NewyearGift
{
	int cnt;
	String ch_name;
	public Sweets(int n, String str)
	{
		cnt=n;
		ch_name=str;
	}
	public void display()
	{
		System.out.println("No of Sweets: " + cnt);
		System.out.println("Name of Sweet: " + ch_name);
	}
}
public class Gift {

	public Gift() {
		// TODO Auto-generated constructor stub		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolates ch = new Chocolates(5,"Dairy Milk");
		ch.display();
		Sweets s1 = new Sweets(3,"Kaju Burfi");
		s1.display();
		Sweets s2 = new Sweets(10,"Dhoodh Ped");
		s2.display();
	}

}
