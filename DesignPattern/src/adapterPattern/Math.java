package adapterPattern;

public class Math {
	public static double twoTime(double num) {
		return num*2;
	}
	public static double half(double num) {
		return num/2;
	}
}
/*
 기존에 double 타입의 값을 받아 두배를 반환하는 twoTime메서드와 절반을 반환하는
 half가 있다
 
 -요구사항
 1. Float 인자값을 받아서 수의 두 배를 Float 타입으로 반환하는 twiceOf 메서드를 구현
 2. Float 인자값을 받아서 수의 절반을 Float 타입으로 반환하는 halfOf 메서드를 구현
 3. 구현 객체명은 Adapter 로 명명 
 */