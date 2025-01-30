package no.hvl.dat109.stigespill;

import java.util.List;
import java.util.ArrayList;

public class Stigespill {
	
	private List<Spiller> spillere;
    private Terning terning;
    
    public Stigespill(List<String> spillernavn) {
        spillere = new ArrayList<>();
        for (String navn : spillernavn) {
            spillere.add(new Spiller(navn));
        }
        terning = new Terning();
    }
	
	public static void main(String [] args) {
		System.out.println("Starter spill ..");
		
		System.out.println("Anthony har vunnet!");
	}
}
