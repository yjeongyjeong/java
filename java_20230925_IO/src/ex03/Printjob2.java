package ex03;

import java.util.Scanner;

public class Printjob2 {
//“ColorType PaperSize Count” 입력받음
//   ColorType , PaperSize, and Count are each separated by exactly one space.
//   흑백이면 장당 5달러 컬러면 장당 15달러
//   메서드만들기 computePrintJobCost( A String colorType, a String paperSize, and an integer count.) 매개변수들은 반드시 주어져야함 이 메서드는 메인에서 사용되어서 total cost를 알려주게 만들기
//   기타 사항)
//   유효하지 않은 값이 들어오지 않게 해야함(너무 큰 size, 음수 count 등)
//   마지막에 5로 끝난다면 올림하기

   static int colorCost;
   static int paperCost;

   public static void main(String[] args) {
//      여기서 입력받기
// Enter colortype papersize and count: Color A4 4 근데 원래 이렇게 입력받고 계산해줘야함... -> 입력받아서 split (" ")해서 배열로 받아서 해야할 것 같음
//=> 배열로 받고 변수에 담아줌-> 3가지 매개변수를 받을 테니 0 1 2 번째마다 각각 변수를 받음 => 메서드에 매개변수 넣어줌
//메서드 : 매개변수 받아와서 equals로 비교해줌!->문자열은 단순비교가 아니라 아예저장된 String영역 주소값을 비교해주어야 true가 나오므로.. => 이후 if를 사용해서 static 영역에 저장된 변수를 데려와 값을 변경시킴(switch - case 구문을 활용해도 괜찮을 것 같음)->이후sysout으로 결과값을 출력시킴

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter colortype papersize and count: \nex) Color/A4/4");

      String order = sc.next();
      String[] userOrder = order.split("/", 3); // " "하면 맨앞만 저장됨.. 왜지...!!!ㅜㅜ

//      for(int i = 0; i<userOrder.length;i++)
//      System.out.println(userOrder[i]);

      String colorType = userOrder[0];
      String paperSize = userOrder[1];
      int count = Integer.valueOf(userOrder[2]);

//      System.out.println(colorType);
//      System.out.println(paperSize);
//      System.out.println(count);

      computePrintJobCost(colorType, paperSize, count);

   }

   static void computePrintJobCost(String colorType, String paperSize, int count) {

      if (colorType.toUpperCase().equals("COLOR")) { //이런식으로 전부 대문자 해주는게 편할듯싶다..
         colorCost = 15;
      } else if (colorType.equals("Grayscale")) {
         colorCost = 5;
      } else {
         System.out.println("Try Again!");
      }

      if (paperSize.equals("A4")) {
         paperCost = 40;
      } else if (paperSize.equals("A5")) {
         paperCost = 20;
      } else if (paperSize.equals("Letter")) {
         paperCost = 30;
      } else if (paperSize.equals("Legal")) {
         paperCost = 25;
      } else {
         System.out.println("Try Again!");
      }
      
      if (count < 0 || count > 100) {
         System.out.println("Try Again!");
      }
//      System.out.println(colorType.equals("Color"));// true....
//      System.out.println(colorType == "Color" );// false....
//      System.out.println(paperSize.equals("A4"));// true....
//      System.out.println(paperSize == "A4");// false....

      int result = (paperCost + colorCost) * count;
//      Math.round(result); //5로 끝나면 올리게.. 하려고 했는데 라운드 함수를 사용하게 되면 내림하는 경우가 발생함! 그렇다고 전부 올리거나 전부 내릴순없음... 
//      ~~~~~> 아니 근데 생각해보니 내림하는경우가 안생김,,(5, 0으로 끝남) 그래서 걍 반올림 써도 될듯,,,,^^;
//      그럼 어떤 수 +5를 10으로 나눈 나머지가 0이면 올림, 아니면(10단위맞춰서 끝난애들) 그냥 냅둠? 
      
      if((result+5)%10 == 0)
         Math.ceil(result);
      System.out.println("Print job cost:" + result);
   }
}