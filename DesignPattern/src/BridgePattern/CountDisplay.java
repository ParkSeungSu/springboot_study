package BridgePattern;

public class CountDisplay extends Display{

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}
	public void multiDisplay(int times) {
		open();
		for (int i =0; i<times;i++) {
			print();
		}
		close();
	}
}
/*
 	'기능의 클래스 계층'이며 Display에서 기능을 추가한 CountDisplay입니다.
 	Display와 마찬가지로 인자값으로 다리역할을 할 수 있는 DisplayImpl을 인자값으로 받습니다.
 	기존 Display의 기능은 모두 그대로 사용 가능하고,더하여'지정 횟수만큼 반복해서 보여주는
 	'multiDisplay 기능을 추가했습니다'. 해당기능은 Display에서 상속받은 print()를 사용하였으며
 	이 밖에도 Display에서 상속받은 메소드를 사용해 새로운 메소드를 추가할 수 있습니다.
 */