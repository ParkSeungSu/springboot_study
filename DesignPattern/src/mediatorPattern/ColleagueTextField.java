package mediatorPattern;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * 
 * Colleague 인터페이스를 구현, 텍스트 입력을 실행하는 클래스
 *
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague{
	private Mediator mediator;
	
	public ColleagueTextField(String text, int columns) throws HeadlessException{
		super(text,columns);
	}
	@Override
	public void setMediator(Mediator mediator) {
		this.mediator=mediator;
		
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
		setBackground(enabled?Color.white : Color.lightGray);
		
	}

	@Override
	public void textValueChanged(TextEvent e) {
		mediator.colleagueChanged();
		
	}
	
}
/*
	텍스트의 내용이 변할 때 textValueChanged 메소드에서 캐치하기 위해서 
	TextListener 인터페이스도 구현하고 있습니다.
	
	textValueChanged는 텍스트의 내용이 변했을 때 AWT의 프레임워크 쪽에서 호출됩니다.
 */