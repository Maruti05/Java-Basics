
public class UnaryOp {
	public static void main(String[] args) {
		int a = 10;
        int b=8;
		System.out.println(a++);
		System.out.println(a);
		System.err.println("----------------------------PRE INC--------------------------------------------");
		System.out.println(++b);
		System.out.println(b);
		
		int c=45;
		int d=78;
		System.out.println(c--);
		System.out.println(c);
		
		System.err.println("----------------------------PRE DEC-----------------------------------");
		System.out.println(--d);
		System.out.println(d);
	}
}
