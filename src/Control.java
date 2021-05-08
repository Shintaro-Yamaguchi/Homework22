import java.util.InputMismatchException;
import java.util.Scanner;

public class Control {
	int x = 0;
	int y = 0;
	
	public void control() {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			while(true) {
				int num = scan.nextInt();
				
				if (num == 1) {
					this.y += 1;
				} else if (num == 3) {
					this.y -= 1;
				} else if (num == 2) {
					this.x += 1;
				} else if (num == 4) {
					this.x -= 1;
				} else if (num == 0) {
					System.out.println("（" + this.x + "、" + this.y + "）");
				} else if (num == 9) {
					System.out.println("プログラムを終了します。");
					break;
				} else {
					System.out.println("対応していない入力です。");
				}
				
			}
		} catch (InputMismatchException e) {
			System.out.println("数値を入力してください。");
			control();
		}
		
		scan.close();
	}

}
