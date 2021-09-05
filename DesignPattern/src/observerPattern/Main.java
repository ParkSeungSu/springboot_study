package observerPattern;

public class Main {

	public static void main(String[] args) {
		RandomNumberGenerator generator = new RandomNumberGenerator();
		DigitObserver ob1 = new DigitObserver();
		GraphObserver ob2 = new GraphObserver();
		generator.addObserver(ob1);
		generator.addObserver(ob2);
		generator.execute();
	}

}
