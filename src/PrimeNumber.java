
public class PrimeNumber {
public static void main(String[] args) {
	int num=6;
	for(int i=2;i<num;i++) {
		if(num%i==0) { //5%2=1 or 6%2=0
			System.out.println(num+"  is Not prime");
			break;
		}
		else {
			System.out.println(num+"  is  prime");
			break;
		}
	}
}
}
