package prodavnicaMuzike;

public class CD extends AlbumArtikal{
	
	
	public CD(Album a, String string, double i, int j) {
		super(a,string,i,j);
		
	}


	public String ime(Album a) {
		String str=null;
		
		str=(a.getIzvodjac()+ " - " +a.getNaziv()+ " (CD)");
		
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
