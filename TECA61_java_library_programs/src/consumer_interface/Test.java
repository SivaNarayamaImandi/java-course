package consumer_interface;

import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {
		Consumer<Integer>c=(num)->
		System.out.println(num%2==0);
		c.accept(123);
	}
}
