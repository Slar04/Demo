
public class Fruits extends Inventaire{
	private int lim_fruits = 10;
	protected double red = 0.85;	
	
	public double getReduction() {
		return red;
	}
	
	public void setReduction(double r) {
		red = r;
	}
	
	public double getLimite() {
		return lim_fruits;
	}
	
	public void setLimite(int l) {
		lim_fruits = l;
	}
}
