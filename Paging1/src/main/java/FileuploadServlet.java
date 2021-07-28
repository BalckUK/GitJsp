
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
		
		//������ ����Ǵ� ���
		//String path = request.getServletContext().getRealPath("files1");
		//System.out.println("������ ����Ǵ� ���1 : "+path);
		
		String path1 =request.getSession().getServletContext().getRealPath("files");
		System.out.println("������ ����Ǵ� ���2 : "+path1);
		
		File local = new File(path1);
		
		if(!local.exists()) {
			local.mkdir();
		}
		
		int size = 1024*1024*10; //���尡���� ���� ũ��
		String file = ""; //���ε� �� ������ �̸�(�̸��� ����ɼ� �ִ�)
		String originalFile = ""; //�̸��� ����Ǳ� �� ���� ���� �̸�
		
		try {
			MultipartRequest multi = new MultipartRequest(request, path1, size, "UTF-8", new DefaultFileRenamePolicy());
			/*
			Enumeration files = multi.getFileNames();
			String str = (String)files.nextElement(); // ���� �̸��� �޾ƿ� String���� ����
			
			file = multi.getFilesystemName(str); //���ε� �� ���� �̸� ������
			//System.out.println("���ε� �� ���� �̸� ������ : "+file);
			originalFile = multi.getOriginalFileName(str); // ������ �����̸� ������
			//System.out.println("������ �����̸� ������ : "+ originalFile);
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
