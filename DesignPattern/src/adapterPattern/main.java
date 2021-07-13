package adapterPattern;

public class main {

	public static void main(String[] args) {
		
		Adapter adapter = new AdapterImpl();
		System.out.println(adapter.twiceOf(100f));//200.0
		System.out.println(adapter.halfOf(50f));//25.0

	}

}

/*
어댑터 패턴을 사용하면 전혀 다른 인자값을 가지고도 몇몇 알고리즘을 사용해서 로직을 수행할 수 있다.

연관없는 두 객체를 연결해서 원하는 요구사항을 수용한다면 생산성 측면에서도 더 높아질 수 있습니다.

이를 통해 우리는 매번 요구사항마다 새로운 알고리즘을 만들거나 타입벼로 비슷한 알고리즘들을
새로 구현할 필요가 없이 기존에 알고리즘을 변형해 재활용 할 수 있게 된다.

예를 들어 리스트 컬렉션(ArrayList)을 버블 정렬을 해야하는 요구사항이 생겼을 때 
나한테 배열을 기준으로 버블정렬을 구현한 알고리즘이 있다면,
굳이 리스트컬렉션을 이용한 새로운 알고리즘을 구현할 필요없이 리스트를 배열로 만들어서 알고리즘을 
수행 후 다시 리스트컬렛션으로 변환하는게 낫다.
*/