package FE_Override;

public class Date {
	private int year;
	private String month;
	private int day;
	
	public Date(){//기본 생성자
		this(1900, "1월", 1);	//생성자에서 사용되는 this는 현재 객체를 가리키는 키워드
	}
	
	public Date(int year){
		this(year, "1월", 1);
	}
	
	public Date(int year, String month, int day){
		this.month = month;
		this.day = day;
		this.year = year;
	}

	@Override
	public String toString(){
		return "Date [year=" + year + ", month=" + month +", day=" + day +"]"; 
	}
}
