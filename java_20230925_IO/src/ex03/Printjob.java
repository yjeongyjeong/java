package ex03;

import java.util.Scanner;

public class Printjob{
//“ColorType PaperSize Count” 입력받음
//	ColorType , PaperSize, and Count are each separated by exactly one space.
//	흑백이면 장당 5달러 컬러면 장당 15달러

	public static void main(String[] args) {
//		여기서 입력받기
// Enter colortype papersize and count: Color A4 4 근데 원래 이렇게 입력받고 계산해줘야함... -> 입력받아서 splite (" ")해서 배열로 받아서 해야할 것 같음

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ColorType(G or C) >>");
		String colorType = sc.next();
		System.out.println("Enter the PaperSize(A4, A5, Letter, Legal) >>");
		String paperSize = sc.next();
		System.out.println("Enter the Print Count >>");
		int count = sc.nextInt();

//	메서드만들기 computePrintJobCost( A String colorType, a String paperSize, and an integer count.) 매개변수들은 반드시 주어져야함 이 메서드는 메인에서 사용되어서 total cost를 알려주게 만들기
		computePrintJobCost(colorType, paperSize, count);
	}

	static void computePrintJobCost(String colorType, String paperSize, int count) {
	if(colorType == "g") {
		colorType = "5";
	} else {
		colorType = "15";
	}
	
	if(paperSize == "A4") {
		paperSize = "40";
	} else if(paperSize == "A5") {
		paperSize = "20";
	} else if(paperSize == "Letter") {
		paperSize = "30";
	} else {
		paperSize = "25";
	}
		int cost = Integer.parseInt(paperSize)*count +Integer.parseInt(colorType)*count;
	System.out.println("Print job cost: " + cost);
}

}

class computePrintJobCost {

	String colorType = null;
	String paperSize = null;
	int count = 0;

	public computePrintJobCost() {
	}

	public computePrintJobCost(String colorType, String paperSize, int count) {
		this.colorType = colorType;
		this.paperSize = paperSize;
		this.count = count;
		
		if(colorType == "g") {
			colorType = "5";
		} else {
			colorType = "15";
		}
		
		if(paperSize == "A4") {
			paperSize = "40";
		} else if(paperSize == "A5") {
			paperSize = "20";
		} else if(paperSize == "Letter") {
			paperSize = "30";
		} else {
			paperSize = "25";
		}
			int cost = Integer.parseInt(paperSize)*Integer.parseInt(colorType)*count;
		System.out.println("Print job cost: " + cost);
	}
}
