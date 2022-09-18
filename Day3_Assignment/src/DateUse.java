
public class DateUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(-1,2,3);
		d1.displayDate();
		Date d2 = new Date(1,-2,3);
		d2.displayDate();
		Date d3 = new Date(1,2,-3);
		d3.displayDate();
		Date d4 = new Date(1,2,100);
		d4.displayDate();
		Date d5 = new Date(1,2,0);
		d5.displayDate();
		Date d6 = new Date(1,22,20);
		d6.displayDate();
		Date d7 = new Date(1,2,20);
		d7.displayDate();
		Date d8 = new Date(0,1,20);
		d8.displayDate();
		Date d9 = new Date(32,1,20);
		d9.displayDate();
		Date d10 = new Date(31,1,20);
		d10.displayDate();
	}

}
