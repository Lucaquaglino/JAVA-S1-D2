package esercizio3;

import java.util.Date;


public class App {

	 public static void main(String[] args) {
		 
		 
	        // Creo articolo
		 
		 
	        Articolo articolo1 = new Articolo("A001", "Telefono", 1000.0, 5);
	        Articolo articolo2 = new Articolo("A002", "Computer", 1500.0, 3);
	        Articolo articolo3 = new Articolo("A003", "Ipad", 700.0, 2);

	        
	        
	        // Creo cliente
	        
	        
	        Cliente cliente1 = new Cliente("C001", "Luca Quaglino", "luca@email.com", new Date());

	        
	        
	        // Creo carrello cliente
	        
	        
	        Carrello carrelloCliente1 = new Carrello(cliente1);

	        
	        
	        // aggiungo articolo al carrello
	        
	        
	        carrelloCliente1.aggiungiArticolo(articolo1);
	        carrelloCliente1.aggiungiArticolo(articolo2);
	        carrelloCliente1.aggiungiArticolo(articolo3);
	        
	        
	        
	        // Stampo dati
	        
	        
	        System.out.println("Cliente: " + cliente1.getNomeCognome());
	        System.out.println("Articoli nel carrello:");
	        for (Articolo articolo : carrelloCliente1.getArticoli()) {
	            System.out.println("- " + articolo.getCodiceArticolo() + ": " + articolo.getDescrizioneArticolo() + " "+"prezzo :"+ " " +articolo.getPrezzo());
	        }
	        System.out.println("Totale costo articoli: " + carrelloCliente1.getTotaleCostoArticoli());
	    }

}
