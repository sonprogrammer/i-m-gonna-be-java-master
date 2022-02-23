import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100)");
		char grade;
		int score=s.nextInt();
		switch(score/10) {
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		default:
			grade='F';
			
		}
		System.out.println("학점은"+grade+"입니다");
		s.close();
	}

}
