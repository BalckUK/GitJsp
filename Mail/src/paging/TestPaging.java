package paging;

public class TestPaging {
	public static void main(String[] args) {
		int totalcount = 303;
		int navicount = 10;
		int countlist = 10;
		int nowpage = 21;
		int totalnavi = 0;

		if (totalcount % countlist != 0) {
			totalnavi = totalcount / countlist + 1;
		} else {
			totalnavi = totalcount / countlist;
		}

		System.out.println("�ϴ� ������ ���� : " + totalnavi);

		if (nowpage < 1) {
			nowpage = 1;
		} else if (nowpage > totalnavi) {
			nowpage = totalnavi;
		}

		System.out.println("���� ������ : " + nowpage);

		int startpage = ((nowpage - 1) / countlist) * countlist + 1;
		int endpage = startpage + countlist - 1;
		if(endpage > totalnavi) {
			endpage = totalnavi;
		}
		
		if(startpage > 1) {
			System.out.println("<a href='?page=1'>[ó��������]</a>");
		}
		
		if(nowpage > 1) {
			System.out.println("<a href='?page= '"+ (startpage-1)+"'>[���� ������]</a>");
		}
		

		for (int i = startpage; i <= endpage; i++) {
			if (nowpage == i) {
				System.out.println("<b>" + i + "</b>");
			} else {
				System.out.println(i);
			}
		}
		
		if(nowpage < totalnavi) {
			System.out.println("<a href='>page="+(endpage+1)+"'>[����������]</a>");
		}
		
		if(endpage < totalnavi) {
			System.out.println("<a href='?page"+ totalnavi + "'>[������ ������]</a>");
		}

	}
}
