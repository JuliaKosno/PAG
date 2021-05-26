import java.util.*;

public class Test {

    public static void obsluzKlientow(Queue<Klient> kolejka){
        for(Klient klient : kolejka){
            System.out.print(klient.toString());
            System.out.print("razem: " + klient.getKoszyk().obliczWartosc()  + "\n\n");
        }
    }
    public static ArrayList<Integer> getRandomNumbers(int min, int max, int n) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < max; i++) {
           nums.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        Collections.shuffle(nums);
        for (int i = 0; i < n; i++) {
            list.add(nums.get(i));
        }
        return list;
    }
    public static int getRand(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String args[]) {

        //zaopatrzenie sklepu
        List<Produkt> listaProduktow = new ArrayList<Produkt>();
        listaProduktow.add(new Produkt("szampon H&H",12.68, true));
        listaProduktow.add(new Produkt("perfumy KelwinKlajn",120.30, true));
        listaProduktow.add(new Produkt("chusteczki Apsik",1.20, true));
        listaProduktow.add(new Produkt("pasta Cleanex",7.99, true));
        listaProduktow.add(new Produkt("dezodorant StayFresh",11.14, true));
        listaProduktow.add(new Produkt("papier Fox",3.44, false));

        //klienci
        List<Klient> listaKlientow = new ArrayList<Klient>();
        listaKlientow.add(new Klient("Leosia123"));
        listaKlientow.add(new Klient("Alka21"));
        listaKlientow.add(new Klient("Szopoholik"));

        //zakupy
        for(Klient k : listaKlientow){
            ArrayList<Integer> listaZakupow = getRandomNumbers(0,listaProduktow.size(),getRand(1, listaProduktow.size()));
            for(int i : listaZakupow){
                int ilosc = getRand(1, 4);
                k.wlozDoKoszyka( listaProduktow.get(i), ilosc);
            }
        }

        //przy kasie
        Queue<Klient> kolejka = new LinkedList<Klient>(listaKlientow);
        obsluzKlientow(kolejka);
    }
}
