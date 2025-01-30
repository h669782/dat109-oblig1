package no.hvl.dat109.stigespill;

public class Brett {
    private Rute[] brett;
    
    public Brett() {
        brett = new Rute[101];
        for (int i = 1; i <= 100; i++) {
            brett[i] = new Rute(i);
        }
    }
    
    public Rute finnRute(int plass, int sum) {
        int nyPlass = Math.min(plass + sum, 100);
        return brett[nyPlass];
    }
}