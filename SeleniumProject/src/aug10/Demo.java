package aug10;

public class Demo {
	public static void test(String... s) {
		int count = s.length;
		System.out.println(count);
		for(String v:s) {
		System.out.println(v);
		}
		}
		public static void main(String[] args) { 
			Demo.test("A1");
			Demo.test("A1","A2");
			Demo.test("A1","A2","A3");
}
}
