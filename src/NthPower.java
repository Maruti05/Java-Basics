
public class NthPower {
public static void main(String[] args) {
	 int base=2;// 2*2*2*2*2=32
	 
	 int power=2;
	 
	 int result=1;
	 
	 for(int j=1;j<=power;j++) {
		 result=result*base;
	 }
	 System.out.println("Power is "+result);
	 
	 System.err.println("===================================USING WHILE LOOP================================================");
	 
	 int res=1;
	 while(power>0) {
		 res=res*base;
		 power--;
	 }
	 System.out.println("Power is "+res);
	 
	 // 0 1 1 2 3 5 8 13
}
}
