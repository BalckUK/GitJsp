package paging;

public class Paging {

	public static void main(String[] args) {
		int page = 27; //���� ������
		int countList = 10; // �� �������� ������ ����Ʈ ����
		int countPage = 10; // �׺�� ����
		int totlalCount = 255; // ��ü �Խù� ����
		
		int totalPage = totlalCount / countList;
		
		if(totalPage % countList > 0) {
			totalPage++;
		}
		
		if(page < 0) {
			page = 1;
		}
		
		if(totalPage < page) {
			page = totalPage;
		}
		
		//////////////////////////////////////////////////////////////
		
		int startPage = ((page -1)/ countPage)*countPage +1;
		int endPage = startPage + countPage -1;
		if(endPage > totalPage) {
			endPage = totalPage;
		}
		
		////////////////////////////////////////////////////////////
		
		if(startPage > 1) {
			System.out.println("<a href='?page=1'>[ó��������]</a>");
		}
		
		if(page > 1) {
			System.out.println("<a href='?page= '"+ (startPage-1)+"'>[���� ������]</a>");
		}
		
		for(int iCount = startPage; iCount<= endPage; iCount++) {
			if(iCount == page) {
				System.out.println("<b>"+iCount+"</b>");
			}else {
				System.out.println(" "+ iCount +  " ");
			}
		}
		
		if(page < totalPage) {
			System.out.println("<a href='>page="+(endPage+1)+"'>[����������]</a>");
		}
		
		if(endPage < totalPage) {
			System.out.println("<a href='?page"+ totalPage + "'>[������ ������]</a>");
		}
		
	}

}
