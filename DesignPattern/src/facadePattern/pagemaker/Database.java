package facadePattern.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/** 
 * 메일 주소에서 사용자 이름을 얻는 클래
 * */
public class Database {
	private Database() {}
	
	public static Properties getProperties(String dbname) {
		String filename = dbname+".txt";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(filename));
		} catch (IOException e) {
			System.out.println("Warning: "+filename+" is not found.");
		}
		return prop;
	}
}

/* 
	인스턴스를 생성하지 않고 static method인 getProperties를 사용해
	Properties 인스턴스를 얻습니다.
	
 */