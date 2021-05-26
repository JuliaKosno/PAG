import java.util.*;

public class ProduktWKoszyku extends Produkt{

    private int ilosc;

    public ProduktWKoszyku(String nazwa, float cena, int ilosc) {
        super(nazwa, cena);
        this.ilosc = ilosc;
    }

    public ProduktWKoszyku(Produkt p, int ilosc) {
        super(p);
        this.ilosc = ilosc;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }


    @Override
    public String toString() {
        return this.getNazwa() + " - " +
                "ilosc: " + ilosc + ", cena: " + this.getCena() +"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProduktWKoszyku that = (ProduktWKoszyku) o;
        return ilosc == that.ilosc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ilosc);
    }
}