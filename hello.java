import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100)");
		int score=s.nextInt();
		System.out.println("학년을 입력하세요(1~4)");
		int grade=s.nextInt();
		if(score>=60) {
			if(grade!=4) 
				System.out.println("합격!");
				else if(score>=70)
					System.out.println("합격");
				else
					System.out.println("불합격");
			}
		
		else
			System.out.println("불합격");
		s.close();
	}

}
