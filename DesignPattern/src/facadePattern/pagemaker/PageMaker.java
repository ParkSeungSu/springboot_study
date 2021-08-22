package facadePattern.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * 메일 주소에서 사용자의 웹 페이지를 작성하는 클래
 *
 */
public class PageMaker {
	private PageMaker() {}
	
	public static void makeWelcomePage(String mailaddr,String filename) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcome to "+username+"'s page!");
			writer.paragraph(username+"의 페이지에 오신걸 환영합니다.");
			writer.paragraph("메일을 기다리고 있습니다.");
			writer.close();
			System.out.println(filename+" is created for"+mailaddr+"{"+username+"}");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
 	외분에서 makeWelcomePage 이라는 메서드 하나만을 노출합니다. 이곳에 메일주소와 출력파일 이름을
 	지정하면 됩니다.
 */
