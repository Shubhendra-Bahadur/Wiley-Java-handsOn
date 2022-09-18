public class Date {
	private int dd, mm, yy;
	
	Date(int dd, int mm, int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void displayDate() {
		if(checkDate())
			System.out.println("Date : "+dd+"/"+mm+"/"+yy);
	}
	
	public boolean checkDate() {
		if(yy<1 || yy>99){
			System.out.println("Year should be between 1 and 99 (Only validate for 2000-2099)");
			return false;
		}
		else if(mm<1 || mm>12) {
			System.out.println("Month should be between 1 and 12");
			return false;
		}
		else if((mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12) && (dd<1 || dd>31)){
			System.out.println("Date should be between 1 and 31");
			return false;
		}
		else if((mm==4 || mm==6 || mm==9 || mm==11) && (dd<1 || dd>30)){
			System.out.println("Date should be between 1 and 30");
			return false;
		}
		else if((mm==2) && (yy%4==0) && (dd<1 || dd>29)){
			System.out.println("Date should be between 1 and 29 (A Leap Year)");
			return false;
		}
		else if((mm==2) && (yy%4!=0) && (dd<1 || dd>28)){
			System.out.println("Date should be between 1 and 28 (Not a Leap Year)");
			return false;
		}
		return true;
	}
}