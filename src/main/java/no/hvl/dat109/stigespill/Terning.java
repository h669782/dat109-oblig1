package no.hvl.dat109.stigespill;

public class Terning {
	private static int verdi;
	
	public Terning() {
	}
	
	public static int getVerdi() {
		return verdi;
	}
	
	public int trill(Spiller spiller) {
		verdi = (int)((Math.random()*6)+1);
		
		while(verdi % 6 == 0 && verdi <= 18) {
			System.out.println(spiller.getNavn() + " kastet 6 og får ett nytt kast");
			verdi += (int)((Math.random()*6)+1);
		}
		
		if(verdi >= 18) {
			return 0;
		}
		
		return verdi;
	}
}