import java.util.*;

public class Klient {
    private String idKlienta;
    private Koszyk koszyk;

    public Klient(String idKlienta){
        this.idKlienta = idKlienta;
        this.koszyk = new Koszyk();
    }

    public void wlozDoKoszyka(Produkt p, int ilosc){
        ProduktWKoszyku pwk = new ProduktWKoszyku(p,ilosc);
        koszyk.dodajDoKoszyka(pwk);
    }

    public void wyjmijZKoszyka(int liczbaProduktow){
        int i = liczbaProduktow;
        while (i>0){
            koszyk.usunZKoszyka();
            i-=1;
        }
    }
    @Override
    public String toString() {
        return "Klient " + '\n' +
                "Nazwa Uzytkownika: " + this.idKlienta + '\n' +
                 this.koszyk + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klient client = (Klient) o;
        return Objects.equals(getIdKlienta(), client.getIdKlienta()) && Objects.equals(getKoszyk(), client.getKoszyk());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdKlienta(), getKoszyk());
    }

    public String getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(String idKlienta) {
        this.idKlienta = idKlienta;
    }

    public Koszyk getKoszyk() {
        return koszyk;
    }

    public void setKoszyk(Koszyk koszyk) {
        this.koszyk = koszyk;
    }
}

