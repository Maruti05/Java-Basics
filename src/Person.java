
public class Person {

	int age;
	
	int weight;
	
	String name;
	
	String clg;
	
	public Person() {
		
	}
	
	//allows only public,private,protected
	//not allow abstract, static, final, and synchronized
	public Person(int a,int b) {
		age=a;
		weight=b;
	}
	
	public void walking() {
		System.out.println(name +" is Walking on Street");
	}
}


