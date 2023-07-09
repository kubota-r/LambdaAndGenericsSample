package generics;

public class Main {
	public static void main(String[] args) {
		//String型を渡した場合
		new MyGenerics<String>().hello("hoge");
		//Integer型を渡した場合
		new MyGenerics<Integer>().hello(10);
		//JavaSilverQ69型を渡した場合
		new MyGenerics<JavaSilverQ69>().hello(new JavaSilverQ69());
	}
}
