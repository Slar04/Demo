
public class Legumes extends Inventaire{
	private int lim_legumes = 20;
	protected double red = 1;
	
	public double getReduction() {
		return red;
	}
	
	public void setReduction(double r) {
		red = r;
	}
	
	public double getLimite() {
		return lim_legumes;
	}
	
	public void setLimite(int l) {
		lim_legumes = l;
	}
}
