package CucumberForJavaBook.Chapter02;

public class Checkout {

	int mRunningTotal;
	
	public void add(int count, int price) {
		if(count <= 0 || price <= 0) return;
		mRunningTotal += (count * price);
	}

	public int total() {
		return mRunningTotal;
	}	
}
