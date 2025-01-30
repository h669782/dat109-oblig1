package no.hvl.dat109.stigespill;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

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
    	System.out.println("Starter spill ...");
        boolean ferdig = false;
        while (!ferdig) {
            for (Spiller spiller : spillere) {
                int terningkast = terning.trill(spiller);
                
                if(terningkast == 0) {
                	System.out.println(spiller.getNavn() + " kastet 6 tre ganger på rad og må flytte tilbake til start");
                	spiller.getBrikke().setPlass(brett.getRute(1));
                }
                else if ( spiller.getBrikke().getPlass().getId() + terningkast > 100){
                	System.out.println(spiller.getNavn() + " kastet " + terningkast + " og blir stående på rute " + spiller.getBrikke().getPlass().getId());
                }
                else {
                    spiller.spillTrekk(terningkast);
                    System.out.println(spiller.getNavn() + " kastet " + terningkast % 6 + " og flyttet til rute " + spiller.getBrikke().getPlass().getId());
                }

                if (spiller.harVunnet()) {
                    System.out.println(spiller.getNavn() + " har vunnet!");
                    ferdig = true;
                    break;
                }
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void initSpill() {
        Scanner scanner = new Scanner(System.in);
        List<String> navn = new ArrayList<>();
        
        System.out.println("Init Stigespill");
        int antallSpillere;
        
        do {
            System.out.print("Skriv inn antall spillere (2-4): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ugyldig input, vennligst skriv et tall mellom 2 og 4.");
                scanner.next();
            }
            antallSpillere = scanner.nextInt();
        } while (antallSpillere < 2 || antallSpillere > 4);
        
        scanner.nextLine();
        
        for (int i = 1; i <= antallSpillere; i++) {
            System.out.print("Skriv inn navn på spiller " + i + ": ");
            navn.add(scanner.nextLine());
        }
        
        Stigespill spill = new Stigespill(navn);
        spill.startSpill();
        scanner.close();
    }
    
    public static void main(String[] args) {
        initSpill();
    }
}
