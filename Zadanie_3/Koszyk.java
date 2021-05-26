import java.util.*;
import java.util.Deque;

public class Koszyk {
    private Deque<ProduktWKoszyku> produkty;

    public Koszyk() {
        produkty = new LinkedList<ProduktWKoszyku>();
    }

    @Override
    public String toString() {
        return "Zawartosc koszyka: " + this.produkty;
    }

    public void dodajDoKoszyka(ProduktWKoszyku p) {
        if (!p.isDostepny())
            System.out.print(p.getNazwa() + ": Brak produktu. \n");
        else
            produkty.push(p);
    }

    public void usunZKoszyka() {
        if(!produkty.isEmpty())
            produkty.pop();
        else
            System.out.print("Koszyk jest pusty.");
    }

    public double obliczWartosc(){
        double suma = 0;
        for(ProduktWKoszyku p : produkty){
            suma += p.getCena()* p.getIlosc();
        }
        suma = Math.round(suma*100);
        return suma/100;
    }


    public Deque<ProduktWKoszyku> getProdukty() {
        return produkty;
    }

    public void setProdukty(Deque<ProduktWKoszyku> produkty) {
        this.produkty = produkty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Koszyk koszyk = (Koszyk) o;
        return Objects.equals(produkty, koszyk.produkty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produkty);
    }
}