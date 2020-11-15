package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Collections;

public class Pitanje {
    private String tekst;
    private int brojPoena;
    ArrayList<String> odgovori = new ArrayList<String>();
    private Object ArrayList;

    public
    Pitanje(String tekst, int brojPoena)
    {
        this.tekst = tekst;
        this.brojPoena = brojPoena;
        ArrayList<String> odgovori = (ArrayList<String>) Collections.EMPTY_LIST;
    }

    public Pitanje(String tekst, double v) {
    }

    public String getTekst(){
        return  tekst;
    }
    

    public int getBrojPoena() {
        return  brojPoena;
    }
    
    
    public void dodajOdgovor(String id, String tekst, boolean tacno)
    {
        odgovori.add(Integer.parseInt(id),tekst);
    }

    public void obrisiOdgovor(String id)
    {
        if(id == null) throw new IllegalArgumentException("Id odgovora mora biti jedinstven");
        odgovori.remove(id);
    }
    
    @Override
    public String toString(){
        System.out.println("Tekst prvog pitanja?(3.0b)\n");
        System.out.println("\ta: tacan odgovor\n\tb: netacan odgovor\n\tc: opet tacan odgovor\n");
        return null;
    }

    public void izracunajPoene(ArrayList<String> id_odgovora, String SistemBodovanja) {
        {
            if (id_odgovora == null) throw new IllegalArgumentException("Odabran je nepostojeći odgovor");
            for (int i = 0; i < id_odgovora.toArray().length; i++) {
                for (int j = i + 1; j < id_odgovora.toArray().length; j++) {
                    if (id_odgovora.get(i).equals(id_odgovora.get(j))) {
                    }
                    throw new IllegalArgumentException("Postoje duplikati među odabranim odgovorim");
                }
            }

        }


    }

    public ArrayList<String> getOdgovori() {
        return odgovori;
    }

    public void setBrojPoena(int i) {
        this.brojPoena = brojPoena;
    }

    public void setBrojPoena(double v) {
    }

    public void setTekst(String promijenjeni_tekst) {
        
    }

    public java.util.ArrayList<String> dajListuOdgovora() {
        return  odgovori;
    }
};
    
