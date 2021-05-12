public class Control {
	int x = 0;
	int y = 0;
	
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
