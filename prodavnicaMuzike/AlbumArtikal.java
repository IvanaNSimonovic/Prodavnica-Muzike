package prodavnicaMuzike;

public abstract class AlbumArtikal extends Artikal {
	private String izdavac;
	private Album album;
	
	public AlbumArtikal(Album a, String izdavac, double cena, int kol) {
		super(cena, kol);
		this.izdavac=izdavac;
		album=a;
		}
	
	public AlbumArtikal() {
	}
	
	public boolean kupi(Artikal a) {
		boolean b=true;
		if (a.getKolicina()<=0)b=false;
		return b;
	}
	
	public abstract String ime();
}
