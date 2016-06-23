
public class WrapperTest {
	public static void main(String[] args) {
		int x = 100;
		double d = 30.99;
		Integer i = new Integer(100);
		Double b = new Double(20.99);
		int y = i;
		Integer j = x;
		double a = b;
		double k = d;
		System.out.println(y);
		System.out.println(a);
		System.out.println(k);
		System.out.println(j==y);
	}

}
