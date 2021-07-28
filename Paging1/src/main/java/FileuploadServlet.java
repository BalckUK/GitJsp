
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;



@WebServlet("/FileuploadServlet")
public class FileuploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//파일이 저장되는 경로
		//String path = request.getServletContext().getRealPath("files1");
		//System.out.println("파일이 저장되는 경로1 : "+path);
		
		String path1 =request.getSession().getServletContext().getRealPath("files");
		System.out.println("파일이 저장되는 경로2 : "+path1);
		
		File local = new File(path1);
		
		if(!local.exists()) {
			local.mkdir();
		}
		
		int size = 1024*1024*10; //저장가능한 파일 크기
		String file = ""; //업로드 한 파일의 이름(이름이 변경될수 있다)
		String originalFile = ""; //이름이 변경되기 전 실제 파일 이름
		
		try {
			MultipartRequest multi = new MultipartRequest(request, path1, size, "UTF-8", new DefaultFileRenamePolicy());
			/*
			Enumeration files = multi.getFileNames();
			String str = (String)files.nextElement(); // 파일 이름을 받아와 String으로 저장
			
			file = multi.getFilesystemName(str); //업로드 된 파일 이름 가져옴
			//System.out.println("업로드 된 파일 이름 가져옴 : "+file);
			originalFile = multi.getOriginalFileName(str); // 원래의 파일이름 가져옴
			//System.out.println("원래의 파일이름 가져옴 : "+ originalFile);
			*/
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
