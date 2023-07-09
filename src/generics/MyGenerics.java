package generics;

public class MyGenerics<T>{
	public void hello(T t) {
		//引数のクラスを表示する
		System.out.println(t.getClass());
	}
}
