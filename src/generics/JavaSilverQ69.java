package generics;

import java.util.function.Function;

public class JavaSilverQ69 {
	public static void main(String[] args) {
		/**
		 * Function一部抜粋
		 * 
		 * public interface Function<T, R> {
		 * 	R apply(T t);
		 * }
		 * 
		 * Functionは関数型インターエースの1つで引数としてT型、戻り値としてR型を返す
		 * （TとかRに入れる型は何でもいい）
		 * T:Type R:Result
		 * 
		 * 今回はTにString、RにIntegerなので以下のメソッドとなる
		 * Integer apply(String t);
		 * 
		 * 要するに以下では引数にString、戻り値がIntegerのapplyメソッドを作成した
		 */

		//ラムダ式によるFunctionの実装
		Function<String, Integer> obj = str -> Integer.parseInt(str) / 1000;
		System.out.println(obj.apply("100"));
		
	}
}
