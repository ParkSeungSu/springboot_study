package mediatorPattern;

import java.awt.Button;

/**
 * 
 * Colleague 인터페이스를 구현, 버튼을 나태는 클래
 *
 */
public class ColleagueButton extends Button implements Colleague {
	private Mediator mediator;
	
	public ColleagueButton(String caption) {
		super(caption);
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator=mediator;
		
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
	}

}

/* 
	awt.Button의 하위클래스지만 Colleague인터페이스를 구현하며 LoginFrame과 협조동작을 수행합니다.
 */