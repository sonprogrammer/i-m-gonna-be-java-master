import java.util.Scanner;
public class order {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("무슨 커피를 드릴까요?");
		String order=s.next();
		int price=0;
		switch(order){
			case "아메리카노":
			case "카푸치노":
			case "카페라떼":
			price=3000;
			break;
			case "아이스티":
				price=2500;
				break;
				default:
					System.out.println("메뉴에 없습니다.");
		}
		if(price!=0) {
			System.out.println(order+"는"+price+"입니다.");
			s.close();
		}
		
		
	}

}
