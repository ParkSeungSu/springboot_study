package mediatorPattern;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * Mediator 인터페이스를 구현, 로그인 다이얼로그를 나타내는 클래스
 *
 */
public class LoginFrame extends Frame implements ActionListener, Mediator {
	private ColleagueCheckbox checkGuest;
	private ColleagueCheckbox checkLogin;
	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;

	public LoginFrame(String title) throws HeadlessException {
		super(title);
		setBackground(Color.lightGray);
		setLayout(new GridLayout(4, 2));
		createColleagues();
		add(checkGuest);
		add(checkLogin);
		add(new Label("Username"));
		add(textUser);
		add(new Label("Password"));
		add(textPass);
		add(buttonOk);
		add(buttonCancel);
		colleagueChanged();
		pack();
		show();
	}

	@Override
	public void createColleagues() {
		CheckboxGroup g = new CheckboxGroup();
		checkGuest=new ColleagueCheckbox("Guest", g, true);
		checkLogin=new ColleagueCheckbox("Login",g,false);
		textUser=new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("",10);
		textPass.setEchoChar('*');
		buttonOk = new ColleagueButton("OK");
		buttonCancel = new ColleagueButton("Cancel");
		
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);
	}

	@Override
	public void colleagueChanged() {
		if(checkGuest.getState()) {
			textUser.setColleagueEnabled(false);
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(true);
		}else {
			textUser.setColleagueEnabled(true);
			userpassChanged();
		}

	}
	private void userpassChanged() {
		if(textUser.getText().length()>0) {
			textPass.setColleagueEnabled(true);
			if(textPass.getText().length()>0) {
				buttonOk.setColleagueEnabled(true);
			}else {
				buttonOk.setColleagueEnabled(false);
			}
		}else {
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		System.exit(0);
	}

}
/*
	Frame의 하위 클래스로 Mediator인터페이스를 구현합니다.
	
	이번 예제에 필요한 다이러로그의 욧소들을 생성하고 필드에 저장합니다.
	
	createColleagues에서는 각각의 Colleague에 대해 setMediator를 호출해 내가 당신의
	중개인(Mediator)니 무슨일이 있으면 알려달라고 선언.
	
	colleagueChanged 메소드에서는 각각의 Colleague들의 상태가 변경될 때 호출되어 로직이 수행
	(Important) 모든 요소(Colleague)들의 상담이 colleagueChanged로 집결됩니다.
*/
