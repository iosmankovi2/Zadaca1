package ba.unsa.etf.rpr;

public class Odgovor {
    String tekstOdgovora;
    boolean Tacno;
    public Odgovor(String tekstOdgovora, boolean Tacno) {
        this.tekstOdgovora = tekstOdgovora;
        this.Tacno = Tacno;
    }

    public String getTekstOdgovora() {
        return tekstOdgovora;
    }

    public void setTekstOdgovora(String tekstOdgovora) {
        this.tekstOdgovora = tekstOdgovora;
    }

    public boolean isTacno() {
        return Tacno;
    }

    public void setTacno(boolean tacno) {
        Tacno = tacno;
    }
}
