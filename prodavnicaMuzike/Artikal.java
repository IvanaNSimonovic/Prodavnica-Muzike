package prodavnicaMuzike;

public abstract class Artikal {
	private static int idGlobal;
	private int id;
	private double cena;
	private int kolicina;
	
	public Artikal(double cena, int kol) {
		this.cena=cena;
		kolicina=kol;
		id=idGlobal;
		idGlobal++;
			
	}
	
	public Artikal () {}
	
	
	public boolean kupi(Artikal a) {
		boolean b=true;
		if (a.getKolicina()<=0)b=false;
		return b;
	}
	public abstract String ime();

	public int getId() {
		return id;
	}

	public double getCena() {
		return cena;
	}

	public int getKolicina() {
		return kolicina;
	}	
	
	public String toString() {
		String str=("#"+id+": "+ime()+" - "+cena+" [kol: "+kolicina+"]");
		return str;
	}

	protected abstract boolean kupi();
    }
	


