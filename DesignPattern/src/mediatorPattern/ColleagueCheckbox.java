package mediatorPattern;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 
 * Colleague 인터페이스를 구현, 체크박스(여기선 라디오박스를)를 나타내는 클래스
 *
 */
public class ColleagueCheckbox extends Checkbox implements ItemListener,Colleague {
	private Mediator mediator;
	
	public ColleagueCheckbox(String label, CheckboxGroup group,boolean state) throws HeadlessException {
		super(label,group, state);
	}
	@Override
	public void setMediator(Mediator mediator) {
		this.mediator=mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		mediator.colleagueChanged();
		
	}

}
