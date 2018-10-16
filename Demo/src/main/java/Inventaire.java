
public abstract class Inventaire {
	private int o,p,c,t;
	private int lim_fruits, lim_legumes;
	
	public Inventaire() {};
	
	public Inventaire(int _o,int _p,int _c,int _t) {
		o=_o;
		p=_p;
		c=_c;
		t=_t;
	}
	
	public int getLimit_f(){
		return lim_fruits;
	}
	
	public int getLimit_l(){
		return lim_legumes;
	}
	
	
}
