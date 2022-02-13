class Program14{
	
	public static void main(String[] args){
		Date d1 = new Date(10, 2, 2022);
		Date d2 = new Date(6, 7, 2001);
		System.out.println(d1);
		System.out.println(d2);
	}
}

class Date{
	private int day;
	private int month;
	private int year;
	
	Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	int getDay(){
		return day;
	}
	
	int getMonth(){
		return month;
	}
	
	int getYear(){
		return year;
	}
	
	void setDay(int day){
		this.day = day;
	}
	
	void setMonth(int month){
		this.month = month;
	}
	
	void setYear(int year){
		this.year = year;
	}
	
	void setDate(int d, int m, int y){
		day = d;
		month = m;
		year = y;
		
	}
	
	public String toString(){
		String dd = String.format("%02d", day);
		String mm = String.format("%02d", month);
		String yyyy = String.format("%04d", year);
		return dd + "/" + mm + "/" + yyyy;
	}
}