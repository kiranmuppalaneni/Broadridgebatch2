
public class ABMain {
public static void main(String[] args) {
//	A a = new A();
//	a.print();
//	
//	A a1 = new B();
//	a1.print();
//	a1 = new C();
//	a1.print();
//
//	B b = new B();
//	b.print();
//	b.write();
	
	AHelper ah = new AHelper();
	ah.callPrint(new C());
}
}
