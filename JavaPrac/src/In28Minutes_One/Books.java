package In28Minutes_One;

public class Books {
	
	private int noofCopies;
	
	void setNoofCopies(int noofcopies) {
		this.noofCopies=noofcopies;
	}
	
	public void increaseCopies(int howmuch) {
		this.noofCopies=this.noofCopies+howmuch;
	}

	public int getNoofCopies() {
		return noofCopies;
	}

}
