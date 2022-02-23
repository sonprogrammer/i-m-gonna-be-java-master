import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1~99사이 정수를 입력하시오.");
		int num=s.nextInt();
		if(num%3==0) {
			System.out.println("박수짝짝");
		}
		s.close();
		}

}
