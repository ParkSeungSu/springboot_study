package chainOfResponsibilityPattern;

/** 
 * 트러블을 해결하는 추상 클래스
 * */
public abstract class Support {
	private String name;
	private Support next;
	
	public Support(String name) {
		this.name=name;
	}
	
	public Support setNext(Support next) {
		this.next=next;
		return next;
	}
	
	public final void support(Trouble trouble) {
		if(resolve(trouble)) {
			done(trouble);
		}else if(next!=null) {
			next.support(trouble);
		}else {
			fail(trouble);
		}
	}
	
	@Override
	public String toString() {
		return "["+name+"]";
	}
	
	protected abstract boolean resolve(Trouble trouble);
	
	protected void done(Trouble trouble) {
		System.out.println(trouble+"is resolved by "+this+".");
	}
	
	private void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved.");
	}
}


/* 
 -트러블을 해결할 사슬을 만들기 위한 추상클래스
 -next 필드는 떠넘기는 곳을 지정하고setNext 메소드로 떠넘기는 곳을 설정합니다.
 -resolve 메소드는 하위클래스에서 구현할 곳을 상정한 추상 메소드입니다.
 -support메소드는 resolve 메소드를 호출하고 반환값이 없으면 '다음 사람' 에게 떠넘기기를 합니다.
  

 */