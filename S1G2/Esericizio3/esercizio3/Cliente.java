package esercizio3;

import java.util.Date;

public class Cliente {

	
	    private String codiceCliente;
	    private String nomeCognome;
	    private String email;
	    private Date dataIscrizione;

	    public Cliente(String codiceCliente, String nomeCognome, String email, Date dataIscrizione) {
	        this.codiceCliente = codiceCliente;
	        this.nomeCognome = nomeCognome;
	        this.email = email;
	        this.dataIscrizione = dataIscrizione;
	    }

	    public String getCodiceCliente() {
	        return codiceCliente;
	    }

	    public String getNomeCognome() {
	        return nomeCognome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public Date getDataIscrizione() {
	        return dataIscrizione;
	    }
	}
