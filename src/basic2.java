import java.util.Scanner;

public class basic2 {

	public static void main(String[] args) {
		final double PI = 3.14;

		Scanner s = new Scanner(System.in);
		System.out.println("반지름을 입력하세요");
		int radius = s.nextInt();
		double circleArea = radius * radius * PI;

		System.out.println("원의 면적은" + circleArea + "이다.");
	}

}
