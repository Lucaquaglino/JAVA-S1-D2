package esercizio2;

public class SIM {
    private String numeroTelefono;
    double creditoDisponibile;
    private Chiamata[] chiamateEffettuate;
    private int numChiamate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0;
        this.chiamateEffettuate = new Chiamata[5];
        this.numChiamate = 0;
    }

    public void stampaDati() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile € : " + creditoDisponibile);
        System.out.println("Ultime 5 chiamate effettuate:");
        for (int i = 0; i < numChiamate; i++) {
            Chiamata chiamata = chiamateEffettuate[i];
            System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato());
            System.out.println("Durata : " + chiamata.getDurata());
            System.out.println();
        }
    }

    public void effettuaChiamata(String numeroChiamato, double durata) {
        Chiamata chiamata = new Chiamata(numeroChiamato, durata);
        if (numChiamate < 5) {
            chiamateEffettuate[numChiamate] = chiamata;
            numChiamate++;
        } else {
            for (int i = 0; i < 4; i++) {
                chiamateEffettuate[i] = chiamateEffettuate[i + 1];
            }
            chiamateEffettuate[4] = chiamata;
        }
    }
}