package mail;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MailServlet")
public class MailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String host = "smtp.naver.com";
		final String username = "haga5032"; // ���̹� ���̵� �Է����ּ���. @nave.com�� �Է����� ���ñ���.
		final String password = "DBaudrms85660@@"; // ���̹� �̸��� ��й�ȣ�� �Է����ּ���.
		int port = 465; // ��Ʈ��ȣ

		// ���� ����
		// Scanner sc = new Scanner(System.in);
		// System.out.print("�޴»�� �̸��� : ");
		// String mail = sc.nextLine();
		String recipient = "haga5032@naver.com"; // �޴� ����� �����ּҸ� �Է����ּ���.
		// System.out.print("���� : ");
		// String title = sc.nextLine();
		String subject = "test"; // ���� ���� �Է����ּ���.
		// System.out.print("���� : ");
		// String code = sc.nextLine();
		String body = "test"; // ���� ���� �Է����ּ���.

		Properties props = System.getProperties();

		// ������ ��� ���� ��ü ����
		// SMTP ���� ���� ����
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", port);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.ssl.trust", host);
		// Session ����
		Session session = Session.getDefaultInstance(props, new Authenticator() {
			String un = username;
			String pw = password;

			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(un, pw);
			}
		});
		session.setDebug(true); // for debug
		Message mimeMessage = new MimeMessage(session); // MimeMessage ����
		try {
			mimeMessage.setFrom(new InternetAddress("haga5032@naver.com"));
			// �ۼ����ּ���.
			mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); // �����ڼ���

			mimeMessage.setSubject(subject); // �������
			mimeMessage.setText(body); // �������
			Transport.send(mimeMessage); // javax.mail.Transport.send() �̿�
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // �߽��� ���� , ������ ����� �̸����ּҸ� �ѹ� �� �Է��մϴ�. �̶��� �̸��� Ǯ
			// �ּҸ� ��
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
