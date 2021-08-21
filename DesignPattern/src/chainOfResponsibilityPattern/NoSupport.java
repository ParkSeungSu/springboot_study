package chainOfResponsibilityPattern;

/** 
 * 트러블을 해결하는 구상 클래스(항상 '처리하지 않는다')
 * */
public class NoSupport extends Support{

	public NoSupport(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
