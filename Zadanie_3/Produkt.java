import java.util.*;

public class Produkt {
    private String nazwa;
    private double cena;
    private boolean dostepny;

    public Produkt(String nazwa, double cena, boolean dostepny) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dostepny = dostepny;
    }

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Produkt(Produkt p) {
        this.nazwa = p.nazwa;
        this.cena = p.cena;
        this.dostepny = p.dostepny;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setCena(float cena) {
        this.cena = cena;
    }

    public boolean isDostepny() {
        return dostepny;
    }

    public void setDostepny(boolean dostepny) {
        this.dostepny = dostepny;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa: '" + nazwa + '\'' +
                ", cena: " + cena +
                ", dostepnosc: " + dostepny +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(produkt.cena, cena) == 0 && dostepny == produkt.dostepny && Objects.equals(nazwa, produkt.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena, dostepny);
    }

}
