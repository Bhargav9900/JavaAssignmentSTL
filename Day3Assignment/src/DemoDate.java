
public class DemoDate {

	public static void main(String[] args) {
		
		int count = MyDate.getCount();
		System.out.println("No of date object "+count);
		// TODO Auto-generated method stub
		MyDate ob = new MyDate();
		ob.printDate();
		
		System.out.println(ob);
		int day=ob.getDay();
		System.out.println("Day: "+day);
		
		ob.setDay(20);
		day=ob.getDay();
		System.out.println("Day: "+day);
		
		count = MyDate.getCount();
		System.out.println("No of date object "+count);
		
	}

}
