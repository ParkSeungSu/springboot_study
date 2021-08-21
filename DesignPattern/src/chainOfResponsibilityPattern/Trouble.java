package chainOfResponsibilityPattern;

/** 
 * 발생한 트러블을 나타내는 클래스, 트러블 번호(number)를 가진다.
 * */
public class Trouble {
	private int number;
	
	public Trouble(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	
	@Override
	public String toString() {
		return "[Trouble "+ number + "]";
	}
}
