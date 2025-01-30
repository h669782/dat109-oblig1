package no.hvl.dat109.stigespill;

import java.util.List;
import java.util.ArrayList;

public class Stigespill {
    private List<Spiller> spillere;
    private Terning terning;
    private Brett brett;
    
    public Stigespill(List<String> spillernavn) {
        spillere = new ArrayList<>();
        brett = new Brett();
        terning = new Terning();
        
        for (String navn : spillernavn) {
            spillere.add(new Spiller(navn, brett));
        }
    }
    
    public void startSpill() {
        boolean ferdig = false;
        while (!ferdig) {
            for (Spiller spiller : spillere) {
                int terningkast = terning.trill();
                spiller.spillTrekk(terningkast);
                
                System.out.println(spiller.getNavn() + " kastet " + terningkast + " og flyttet til rute " + spiller.getBrikke().getPlass().getId());
                
                if (spiller.harVunnet()) {
                    System.out.println(spiller.getNavn() + " har vunnet!");
                    ferdig = true;
                    break;
                }
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Starter spill ..");
        
        List<String> navn = new ArrayList<>();
        navn.add("Anthony");
        navn.add("Jonas");
        
        Stigespill spill = new Stigespill(navn);
        spill.startSpill();
    }
}