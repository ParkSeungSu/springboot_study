package mediatorPattern;
/**
 * 
 * 중개인의 인터페이스(API)를 결정하는 인터페이스
 *
 */
public interface Mediator {
	public abstract void createColleagues();
	public abstract void colleagueChanged();
}
/* 
	중개인 인터페이스
	
	createColleagues는 Mediator가 관리하는 회원을 생성하는 메소드 예제에서는
	필요한 버튼이나 텍스트 필드 등을 작성합니다.
	
	colleagueChanged는 회원(Colleague)들에서 호출되는 메소드로 중개인에 대한 상담입니다.
	예제에서는 라디오버튼이나 텍스트 필드의 상태가 변할 때 호출
	
 */