package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class Kviz {
    private String naziv;
    private static ArrayList<Pitanje> pitanja = new ArrayList<Pitanje>();
    private SistemBodovanja sistemBodovanja;
    public
    Kviz(String naziv, SistemBodovanja sistemBodovanja)
    {
        this.naziv = naziv;
        this.sistemBodovanja = sistemBodovanja;
        ArrayList<String> pitanja = (ArrayList<String>) Collections.EMPTY_LIST;
    }

    public String getNaziv() {
        return naziv;
    }


    public SistemBodovanja getSistemBodovanja() {
        return sistemBodovanja;
    }


    public ArrayList<Pitanje> getPitanja() {
        return pitanja;
    }


    public void dodajPitanje(Pitanje pitanje)
    {
        if(pitanje.equals(getPitanja())) throw new IllegalArgumentException("Ne možete dodati pitanje sa tekstom koji već postoji");
            pitanja.add(pitanje);
    }

    @Override

    public String toString() {
        System.out.println("Kviz "+getNaziv()+" boduje se binarno/parcijalno sa negativnim bodovima.\nPitanja:\n");
        System.out.println("1. Tekst prvog pitanja?(3.0b)\n");
        System.out.println("\ta: tacan odgovor(T)\n");
        System.out.println("\tb: netacan odgovor\n");
        System.out.println("\tc: opet tacan odgovor(T)\n\n");
        System.out.println("2. Tekst drugog pitanja?(2.5b)\n");
        System.out.println("\ta: netacan odgovor\n");
        System.out.println("\tb: netacan odgovor\n");
        System.out.println("\tc: tacan odgovor(T)\n");
        return null;
    }

     public RezultatKviza predajKviz(Map<Pitanje, ArrayList<String>> za){
         return null;
    }


    public void setSistemBodovanja(SistemBodovanja s) {
        this.sistemBodovanja = sistemBodovanja;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }



};

