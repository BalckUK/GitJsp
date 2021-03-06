package DTO;

public class PaingDTO {
	private int num;
	private String writer;
	private String title;
	private String content;

	public PaingDTO() {

	}

	public PaingDTO(int num, String writer, String title, String content) {
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
