package mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class GroupSendMails {
	public static void main(String[] args) {

		/* PORT = 25:non-ssl, 465:ssl, 587:tls */
		Properties props = System.getProperties();
		props.put("mail.smtp.host", "smtp.naver.com");
		props.put("mail.smtp.port", "25");
		props.put("defaultEncoding", "utf-8");
		props.put("mail.smtp.auth", "true");

		final String userId = "haga5032";
		final String userPw = "DBaudrms85660@@";

		try {
			String sender = "haga5032@naver.com"; // �����»�� �����ּ�. ex) mailSender@naver.com
			String subject = "���� �׽�Ʈ"; // ���� ����
			String body = "�� ���� �޾ƶ� !!"; // ���� ����

			Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
				String un = userId;
				String pw = userPw;

				protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
					return new javax.mail.PasswordAuthentication(un, pw);
				}
			});
			session.setDebug(false); // Debug ��� ����.

			Message mimeMessage = new MimeMessage(session);
			mimeMessage.setFrom(new InternetAddress(sender));

			// �޴� ��� �̸����ּ� ����
			InternetAddress[] toAddr = new InternetAddress[2];
			toAddr[0] = new InternetAddress("haga5032@naver.com");
			toAddr[1] = new InternetAddress("johnoxide@naver.com");

			mimeMessage.setRecipients(Message.RecipientType.TO, toAddr); // ������ ����
			mimeMessage.setSubject(subject); // ���� ����
			mimeMessage.setText(body); // ���� ����

			// ���� �߼�
			Transport.send(mimeMessage);

			System.out.println("���� �߼� ����!!");
		} catch (Exception e) {
			System.out.println("���Ϻ����� ���� : " + e.getMessage());
		}
	}

}
