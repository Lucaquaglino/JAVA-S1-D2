package esercizio3;

public class Articolo {
	
	    private String codiceArticolo;
	    private String descrizioneArticolo;
	    private double prezzo;
	    private int pezziDisponibili;

	    public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo, int pezziDisponibili) {
	        this.codiceArticolo = codiceArticolo;
	        this.descrizioneArticolo = descrizioneArticolo;
	        this.prezzo = prezzo;
	        this.pezziDisponibili = pezziDisponibili;
	    }

	    public String getCodiceArticolo() {
	        return codiceArticolo;
	    }

	    public String getDescrizioneArticolo() {
	        return descrizioneArticolo;
	    }

	    public double getPrezzo() {
	        return prezzo;
	    }

	    public int getPezziDisponibili() {
	        return pezziDisponibili;
	    }
	}

