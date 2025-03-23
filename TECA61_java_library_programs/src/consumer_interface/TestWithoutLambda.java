package consumer_interface;

import java.util.function.Consumer;

public class TestWithoutLambda implements Consumer<Integer> {
	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}

	public static void main(String[] args) {
		Consumer<Integer> c = new TestWithoutLambda();
		c.accept(1234);
	}

}
