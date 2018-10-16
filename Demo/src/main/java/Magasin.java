
public class Magasin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Reductions\n Fruits -> $1.00 de réduction chaque kilo\n Legumes -> $0.85 de réduction chaque kilo\n");
		
		System.out.println("Limite de produits vendus par jours\nLegumes 20 kg\tFruits - 10 kg"
		+"\n\n Pomme - 20 kg \n Orange - 50 kg\n Concombre - 20 kg \n Tomate - 50 kg");
		
		//orange-pomme-tomate-concombre
		
		Inventaire i = new Inventaire(20,30,56,70);
		
	}

}
