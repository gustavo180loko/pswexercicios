
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
	
	public String toString(){
		
		return x + "," + y;
		
	}
}
