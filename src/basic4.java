import java.util.Scanner;
public class basic4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("여자친구이름은?");
		String name =s.next();
		System.out.println("나이는?");
		int age = s.nextInt();
		System.out.println("사랑하나요?");
		boolean love = s.nextBoolean();
		System.out.println(love);
		if(love==true)
			System.out.println("결혼까지 행복하세요오오옹~~~");
		else
			System.out.println("분발하세요!!!!!");
		s.close();
		
	}

}
