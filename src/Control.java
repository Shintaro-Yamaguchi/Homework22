public class Control {
	int x;
	int y;
	
	Control(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("現在位置は、（" + this.x + "、" + this.y + "）");
	}
	
	public void north() {
		this.y += 1;
	}
	
	public void east() {
		this.x += 1;
	}
	
	public void south() {
		this.y -= 1;
	}
	
	public void west() {
		this.x -= 1;
	}
	
	public void location() {
		System.out.println("（" + this.x + "、" + this.y + "）");
	}
	
}
