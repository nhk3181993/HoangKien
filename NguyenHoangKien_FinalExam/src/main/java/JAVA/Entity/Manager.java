package JAVA.Entity;

public class Manager extends User{
	private int ExpInYear;

	public Manager() {
		super();
	}
	
	
	
	public Manager(int id, String fullName, String email, String password, int expInYear) {
		super(id, fullName, email, password);
		ExpInYear = expInYear;
	}



	public Manager(int expInYear) {
		super();
		ExpInYear = expInYear;
	}

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	@Override
	public String toString() {
		return  super.toString() + "\nExpInYear : " + ExpInYear;
	}
	
}
