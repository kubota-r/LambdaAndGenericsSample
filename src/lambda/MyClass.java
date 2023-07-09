package lambda;

public class MyClass implements MyInterface {
	@Override
	public void helloMyInterface(String name) {
		System.out.println(name + " Hello MyClass");
	}
}
