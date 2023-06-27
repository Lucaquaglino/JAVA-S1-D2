package esercizio3;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
	private Cliente cliente;
	private List<Articolo> articoli;
	private double totaleCostoArticoli;

	public Carrello(Cliente cliente) {
		this.cliente = cliente;
		this.articoli = new ArrayList<>();
		this.totaleCostoArticoli = 0.0;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Articolo> getArticoli() {
		return articoli;
	}

	public double getTotaleCostoArticoli() {
		return totaleCostoArticoli;
	}

	public void aggiungiArticolo(Articolo articolo) {
		articoli.add(articolo);
		totaleCostoArticoli += articolo.getPrezzo();
	}
}
