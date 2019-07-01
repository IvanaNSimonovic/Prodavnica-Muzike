package prodavnicaMuzike;

import java.util.LinkedList;

public class Prodavnica {
	private String ime;
	private String lokacija;
	private LinkedList<Artikal> inventar;
	
	public Prodavnica(String ime, String lokacija){
		this.ime=ime;
		this.lokacija=lokacija;
	}
	
	public void dodaj(Artikal a) {
		this.inventar.add(a);
		}
	
	
	public LinkedList<Artikal> pretrazi(String tekst) {
		LinkedList<Artikal> pretraga=new LinkedList<>();
		for(int i=0;i<this.inventar.size();i++) {
			if(inventar.get(i).ime().toLowerCase().contentEquals(tekst.toLowerCase())) {pretraga.add(i, inventar.get(i));}
		}
		
		return pretraga;
	}

}
