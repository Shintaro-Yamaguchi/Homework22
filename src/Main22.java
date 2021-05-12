import java.util.InputMismatchException;
import java.util.Scanner;

public class Main22 {
	public static void main(String[] args) {
		System.out.println("ロボット歩行プログラムへようこそ。");
		System.out.println("以下の中からロボットに指示を出してください。");
		System.out.println("0：現在位置を表示。");
		System.out.println("1：北へ進む。");
		System.out.println("2：東へ進む。");
		System.out.println("3：南へ進む。");
		System.out.println("4：西へ進む。");
		System.out.println("9：プログラムを終了。");
		
		int num;
		Control c = new Control();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			try {
				num = scan.nextInt();
			
				if(num == 1) {
					c.north();
				} else if(num == 2) {
					c.east();
				} else if(num == 3) {
					c.south();
				} else if(num == 4) {
					c.west();
				} else if(num == 0) {
					c.location();
				} else if(num == 9) {
					System.out.println("プログラムを終了します。");
					break;
				} else {
					System.out.println("");
					System.out.println("対応していません。以下の数値を入れてください。");
					System.out.println("0：現在位置を表示。");
					System.out.println("1：北へ進む。");
					System.out.println("2：東へ進む。");
					System.out.println("3：南へ進む。");
					System.out.println("4：西へ進む。");
					System.out.println("9：プログラムを終了。");
					System.out.println("");
				}
			} catch(InputMismatchException e) {
				System.out.println("");
				System.out.println("対応していません。以下の数値を入れてください。");
				System.out.println("0：現在位置を表示。");
				System.out.println("1：北へ進む。");
				System.out.println("2：東へ進む。");
				System.out.println("3：南へ進む。");
				System.out.println("4：西へ進む。");
				System.out.println("9：プログラムを終了。");
				System.out.println("");
				scan.next();
			}
			
		}
			
	}

}
