package chainOfResponsibilityPattern;

/** 
 * 트러블을 해결하는 구상 클래스(홀수 번호의 트러블을 해결)
 * */
public class OddSupport extends Support{

	public OddSupport(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		return trouble.getNumber()%2==1;
	}

}
