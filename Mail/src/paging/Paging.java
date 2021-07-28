package paging;

public class Paging {

	public static void main(String[] args) {
		int page = 27; //현재 페이지
		int countList = 10; // 한 페이지에 보여줄 리스트 갯수
		int countPage = 10; // 네비바 갯수
		int totlalCount = 255; // 전체 게시물 갯수
		
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
			System.out.println("<a href='?page=1'>[처음페이지]</a>");
		}
		
		if(page > 1) {
			System.out.println("<a href='?page= '"+ (startPage-1)+"'>[이전 페이지]</a>");
		}
		
		for(int iCount = startPage; iCount<= endPage; iCount++) {
			if(iCount == page) {
				System.out.println("<b>"+iCount+"</b>");
			}else {
				System.out.println(" "+ iCount +  " ");
			}
		}
		
		if(page < totalPage) {
			System.out.println("<a href='>page="+(endPage+1)+"'>[다음페이지]</a>");
		}
		
		if(endPage < totalPage) {
			System.out.println("<a href='?page"+ totalPage + "'>[마지막 페이지]</a>");
		}
		
	}

}
