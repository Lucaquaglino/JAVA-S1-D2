package esercizio2;

public class App {
    public static void main(String[] args) {
        SIM sim = new SIM("1234753290");
        sim.creditoDisponibile = 10.5;

        sim.effettuaChiamata("9476543210", 3);
        sim.effettuaChiamata("2465456135790", 5);
        sim.effettuaChiamata("135794443680", 2.5);

        sim.stampaDati();
    }
}




	



