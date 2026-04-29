package dia28Abril;

public class Test {
	
	public static void main(String[] args) {
		B b = new B(10);
		int x = b.getX();
		
		A a = new B(0);
		Object o = new Object();
		
		if(o instanceof A) {
			System.out.println(o.getX());
		}
	}

}
