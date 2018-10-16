
public class Pomme extends Fruits implements Vendeur{
	private int limite;
	private double prixKg = 2;
	
	public Pomme(int cant) {
		limite = cant;
	}
	
	public double reduction (double total, double rdcn, int kg) {
		return (total-(rdcn*kg));
	}
	
	public double vendre (int cantite_inv,int cantite_vendre) {
		double ttl,r;
		
		ttl = cantite_inv-(this.prixKg*cantite_vendre);
		r= reduction (ttl, super.red, cantite_vendre);
		
		return (ttl-r);
	}
	
	public double getPrix() {
		return this.prixKg;
	}
	
	void setPrix(double _prix) {
		this.prixKg = _prix;
	}
}
