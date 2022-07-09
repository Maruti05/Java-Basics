
public class PersonDemo {
public static void main(String[] args) {
	//int a=10;
	
	//heer p is object 
	// Person()-- default contructor
	// Person is data type
	Person  p= new Person();
	System.out.println(p);
	//here u r setting values to proprty/attributes/state
	p.age=40;
	p.clg="Tippu";
	p.name="Manju";
	p.weight=60;
	
	//here getting  proprty/attributes/state value
	System.out.println(p.age);
	System.out.println(p.clg);
	System.out.println(p.name);
	System.out.println(p.weight);
	
	p.walking();
	
	System.err.println("============================================PERSON 2==============================================");
	Person  p2= new Person();
	System.out.println(p2);
	p2.age=50;
	p2.clg="Tippu P";
	p2.name="maruti";
	p2.weight=80;
	
	//here we r calling method/behevior/function
	p2.walking();
}
}
