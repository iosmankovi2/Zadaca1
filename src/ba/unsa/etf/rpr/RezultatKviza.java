package ba.unsa.etf.rpr;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Map;

public class RezultatKviza {
    Kviz kviz;
    double total;
    Map<Pitanje, Double> bodovi;
    public
    RezultatKviza(Kviz kviz)
    {
        this.total = 0;
    }

    public Kviz getKviz() {
        return kviz;
    }

    public double getTotal() {
        return total;
    }

    public Map<Pitanje, Double> getBodovi() {
        return bodovi;
    }

    public void setBodovi(Map<Pitanje, Double> bodovi) {
        this.bodovi = bodovi;
    }

    public void setKviz(Kviz kviz) {
        this.kviz = kviz;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override

    public String toString()
    {
        System.out.println("Na kvizu "+ getKviz()+" ostvarili ste ukupno "+getTotal()+" poena. Raspored po pitanjima:\n");
        System.out.println("Tekst pitanja - "+getBodovi()+"\n");
        System.out.println("Tekst pitanja - "+getBodovi()+"\n");
        System.out.println("Tekst pitanja - "+getBodovi()+"\n");
        return null;
    }
}
