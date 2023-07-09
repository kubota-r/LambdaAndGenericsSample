package lambda;
//関数型インターフェースだよという注釈(アノテーション)
//※関数型インターフェース：単一の抽象メソッドを持つインターフェース
@FunctionalInterface
public interface MyInterface {
	public void helloMyInterface(String name);
}
