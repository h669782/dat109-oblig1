package no.hvl.dat109.stigespill;

import java.util.Random;

public class Terning {
	private static int verdi;
	
	public Terning() {
	}
	
	public int getVerdi() {
		return verdi;
	}
	
	public static int trill() {
		verdi = (int)((Math.random()*6)+1);
		
		while(verdi % 6 == 0 && verdi <= 18) {
			verdi += (int)((Math.random()*6)+1);
		}
		
		if(verdi >= 18) {
			return 0;
		}
		
		return verdi;
	}
}