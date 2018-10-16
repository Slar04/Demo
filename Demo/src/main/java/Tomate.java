
public class Tomate extends Fruits{
	private int limite;
	private double prixKg = 2;
	
	public Tomate(int cant) {
		limite = cant;
	}
	
	public double getPrix() {
		return this.prixKg;
	}
	
	void setPrix(double _prix) {
		this.prixKg = _prix;
	}
	
	public double reduction (double total, double rdcn, int kg) {
		return (total-(rdcn*kg));
	}
	
	public double total (int cantite_inv,int cantite_vendre) {
		double ttl,r;
		
		ttl = cantite_inv-(this.prixKg*cantite_vendre);
		r= reduction (ttl, super.red, cantite_vendre);
		
		return (ttl-r);
	}
}
