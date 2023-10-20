package ex01;


import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버경제뉴스 {
   
   public static void main(String[] args) throws IOException {
      
      int pages = 5;

      for(int i=1; i<pages; i++) {

      //네이버->경제 > 금융카테고리

      String url = "https://news.naver.com/main/list.naver?mode=LS2D&sid2=259&sid1=101&mid=shm&date=20220501&page="+i;

      Document doc = Jsoup.connect(url).get(); //사이트 정보 읽어 온다.
      Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body"); //class는 여러개라서 복수로 설정해줌
      Element element = elements.get(0);
//      System.out.println(element);

      Elements photoelements = doc.getElementsByAttributeValue("class", "photo");
      for(int j = 0; j < photoelements.size(); j++) {
      	Element newelements = photoelements.get(j);
//    	  System.out.println(newelement);
      	Elements a_newlelments = newelements.select("a");
      	Element a_newlelment = a_newlelments.get(0);
//      	System.out.println(a_newlelment);
      	String newUrl = a_newlelments.attr("href"); //기사링크
      	System.out.println(newUrl);
      	
      	Elements imglelments = newelements.select("img"); 
//      	System.out.println(imglelments);
      	Element imgelement = imglelments.get(0);
//      	System.out.println(imgelement);
      	
      	String imgUrl = imgelement.attr("src"); //이미지링크
//      	System.out.println(imgUrl);
      	String title = imgelement.attr("alt");
      	Document detailDoc = Jsoup.connect(newUrl).get(); //기사제목 클릭 상세 기사로 이동주소
      	Element contentElement = detailDoc.getElementById("dic_area");
//      	System.out.println(contentElement.text()); //br채그 있는 건 text로 기사 내용만 검색
      	String content = contentElement.text();
      	
      	System.out.println(title);
      	System.out.println(content);
      	
      	}      
      }
   }
}