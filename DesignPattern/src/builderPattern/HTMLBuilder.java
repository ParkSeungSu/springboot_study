package builderPattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
	private String filename;
	private PrintWriter writer;

	@Override
	public void makeTitle(String title) {
		filename = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</title></head><body>");
		writer.println("<h1>" + title + "</h1>");
	}

	@Override
	public void makeString(String str) {
		writer.println("<p>" + str + "</p>");

	}

	@Override
	public void makeItems(String[] items) {
		writer.println("<ul>");
		for (int i = 0; i < items.length; i++) {
			writer.println("<li>" + items[i] + "</li>");
		}
		writer.println("</ul>");

	}

	@Override
	public void close() {
		writer.println("</body></html>");
		writer.close();
	}

	public String getResult(){
		return filename;
	}
}

/*
 * TextBuilder or HTMLBuilder 는 ConcreteBuilder 역할을 수행하며 Builder 역할의 인터페이스(API)를
 * 구현하는 클래스 입니다. 실제 인스턴스 작성으로 호출되는 메소드가 여기서 정의됩니다. 최종결과를 얻기위한 메소드가 준비되어 있습니다.
 * (getResult())
 * 
 */
