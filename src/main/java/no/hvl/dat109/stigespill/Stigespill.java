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
    
    public void startSpill() {
    	boolean ferdig = false;
    	while(!ferdig) {
    		for(Spiller spiller : spillere) {
    			spiller.spillTrekk();
    			
    			System.out.print(spiller + " kastet " + Terning.getVerdi() + " og flyttet til rute " + spiller.getBrikke().getPlass().getId()+1);
    			
                if (spiller.harVunnet()) {
                    System.out.println(spiller.getNavn() + " har vunnet!");
                    ferdig = true;
                    break;
    		}
                try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	}
    }
    }
	
	public static void main(String [] args) {
		System.out.println("Starter spill ..");
		
        List<String> navn = new ArrayList<>();
        navn.add("Anthony");
        navn.add("Jonas");
        
        Stigespill spill = new Stigespill(navn);
        spill.startSpill();
		
	}
}
