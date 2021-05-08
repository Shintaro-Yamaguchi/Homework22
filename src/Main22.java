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
		
		Control c = new Control();
		c.control();

	}

}
