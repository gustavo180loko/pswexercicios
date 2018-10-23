
public class Ponto2D {
	
	private int x;
	private int y;
	
	public Ponto2D(int x1,int y1){
		this.x = x1;
		this.y = y1;
	}
	
	public Ponto2D() {
		x = 0;
		y = 0;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString(){
		
		return "X: "+x + ","+" Y: " + y;
		
	}
}
