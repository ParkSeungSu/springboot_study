package chainOfResponsibilityPattern;

/** 
 * 트러블을 해결하는 구상 클래스(특정 번호의 트러블을 해결)
 * */
public class SpecialSupport extends Support{
	private int number;

	public SpecialSupport(String name,int number) {
		super(name);
		this.number = number;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		return trouble.getNumber()==number;
	}

}
