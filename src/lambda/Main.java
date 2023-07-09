package lambda;

public class Main {
	public static void main(String[] args) {
		//MyInterfaceのメソッドを実装したMyClassのインスタンス生成
		MyClass mc = new MyClass();
		mc.helloMyInterface("kubota");

		//Interfaceをその場で実装(無名クラス)
		MyInterface mc2 = new MyInterface() {
			@Override
			public void helloMyInterface(String name) {
				System.out.println(name + " Hello Anonymous Class");
			}
		};
		mc2.helloMyInterface("kubota");

		//無名クラスを実装するプログラムコードを短くしたもの(ラムダ式)
		MyInterface mc3 = (String name) -> {
			System.out.println(name + " Hello Lambda");
		};
		mc3.helloMyInterface("kubota");

		//ラムダ式で省略可能な部分を省略したもの
		MyInterface mc4 = (name) -> System.out.println(name + " Hello Lambda2");
		mc4.helloMyInterface("kubota");
	}
}
