import java.util.InputMismatchException;
import java.util.Scanner;

public class Control {
	int x = 0;
	int y = 0;
	Scanner scan = new Scanner(System.in);
	int num;
	
	public void north() {
		if (this.num == 1) {
			this.y += 1;
			location();
		}
		
	}
	
	public void east() {
		if (this.num == 2) {
			this.x += 1;
			location();
		}
		
	}
	
	public void south() {
		if (this.num == 3) {
			this.y -= 1;
			location();
		}
		
	}
	
	public void west() {
		if (this.num == 4) {
			this.x -= 1;
			location();
		}
		
	}
	
	public void location() {
		try {
			this.num = scan.nextInt();
		
			if(num == 9) {
				System.out.println("プログラムを終了します。");
			}
			
			while(true) {

				if(num == 1) {
					north();
				} else if(num == 2) {
					east();
				} else if(num == 3) {
					south();
				} else if(num == 4) {
					west();
				} else if(num == 0) {
					System.out.println("（" + this.x + "、" + this.y + "）");
					location();
				} else if(num == 9) {
					break;
				} else {
					System.out.println("対応していない数値です。");
					location();
				
				}
				
			}
		
		} catch(InputMismatchException e) {
			System.out.println("数値を入力してください。");
//			location();
			
		}
			
	}

}
