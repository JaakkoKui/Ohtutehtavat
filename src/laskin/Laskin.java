package laskin;
import java.io.Console;
import java.lang.Math;
public class Laskin {

    private double tulos;  	// Muuttuja tulokselle

    public void nollaa() {  // Nollaa tulosmuuttuja
        tulos = 0;
    }

    public double annaTulos() {
        return tulos;
    }

    public void lisaa(double n) {
        tulos = tulos + n;
    }

    public void vahenna(double n) {
        tulos = tulos - n;
    }

    public void kerro(double n) {
        tulos = tulos * n;
    }

    public void jaa(double n) {
    	if (n==0) throw new IllegalArgumentException("Nollalla ei voi jakaa");
        tulos = tulos / n;
    }
    
    public void nelio(double n) {
    	if (n < 0) throw new IllegalArgumentException("");
        tulos = n * n;
    }

    public void neliojuuri(double n) {
    	if(n < 0) throw new IllegalArgumentException("Negatiivisella luvulla ei ole neliöjuurta");
    	tulos = 0;
    }

    public void virtaON() {
        nollaa();
        tulos = 0;
    }

    public void virtaOFF() {
        System.out.println("Moikka");
    }

}
