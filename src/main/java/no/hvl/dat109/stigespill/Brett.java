package no.hvl.dat109.stigespill;

public class Brett {
	private static Rute[] brett = new Rute[100];
	
	public Brett() {
		
	}
	
	public static Rute finnRute(int plass, int sum) {
		if((plass + sum) <= 100) {
			plass += sum;
		}
		
		return brett[plass];
	}
}
