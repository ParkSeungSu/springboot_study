package facadePattern.pagemaker;
/**
 * 
 * HTML 파일을 생성하는 클래
 *
 */

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
	private Writer writer;
	
	public HtmlWriter(Writer writer) {
		this.writer=writer;
	}
	public void title(String title) throws IOException {
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<title>"+title+"</title>");
		writer.write("</head>");
		writer.write("<body>\n");
		writer.write("<h1>"+title+"</h1>");
		
	}
	
	public void paragraph(String msg) throws IOException {
		writer.write("<p>"+msg+"</p>\n");
	}
	public void link(String href,String caption) throws IOException{
		paragraph("<a herf=\""+href+"\""+caption+"</a>");
	}
	public void mailto(String mailaddr, String username) throws IOException{
		link("mailto:"+mailaddr,username);
	}
	public void close() throws IOException{
		writer.write("</body>");
		writer.write("</html>\n");
		writer.close();
	}
}
/*
	간단한 웹 페이지를 만드는 클래스
	
	최초 title메소드를 사용해야 다른 메서드를 쓸 수 있다는 제약조건이 있습니다.
	참조 되는 PageMaker는 해당 제약을 지켜야 합니다.
 */