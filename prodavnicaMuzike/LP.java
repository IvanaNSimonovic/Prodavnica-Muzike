package prodavnicaMuzike;

public class LP extends AlbumArtikal{
	
	private int tezina;

	public LP(int t) {
		tezina=t;
	}
	
	public LP(Album a, String string, double i, int j, int k) {
		super(a,string,i,j);
		tezina=k;	
	}

	public String ime(Album a) {
		
		String str=null;
		str+=(a.getIzvodjac() + " - " + a.getNaziv()+ " ("+this.tezina+ " [g]  LP )");
		
		return str;
	}

	
	public String ime() {
		
		return null;
	}

	public boolean kupi(Artikal a) {
		boolean b=true;
		if (a.getKolicina()<=0)b=false;
		return b;
		
	}

	@Override
	protected boolean kupi() {
		// TODO Auto-generated method stub
		return false;
	}

}
