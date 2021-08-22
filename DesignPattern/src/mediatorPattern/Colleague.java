package mediatorPattern;
/**
 * 
 * 회원의 인터페이스(API)를 결정하는 인터페이스
 *
 */
public interface Colleague {
	public abstract void setMediator(Mediator mediator);
	public abstract void setColleagueEnabled(boolean enabled);
}
/* 
	중개인(Mediator)에게 상담을 의뢰하는 회원을 나타내는 인터페이스로
	ColleagueButton, ColleagueTextField등이 인터페이스를 구현합니다.
	
	setMediator메소드는 Mediator 인터페이스를 구현한 LoginFrame클래스가 최초로 호출하는
	메소드로 내가 중개인이다 라고 전선하는 목적
	
	setColleagueEnabled 메소드는 중개인이 내리는 지시에 해당합니다..
	enabled	상태에 따라 유효/무효 상태가 결정됩니다.
	
 */