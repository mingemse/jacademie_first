package org.jacademie.first.domain;

abstract public class Compte {

	private String numero;
	
	private String intitule;
	
	private Double solde;
	
	public Compte() {

		this.solde=0.0;
	}

	public Compte(String numero, String intitule, Double solde) {

		this.numero = numero;
		
		this.intitule = intitule;
		
		if (solde >= 0) {
			
			this.solde = solde;
		}
		else {
			solde = 0.0;
		}
	}

	public void crediter(Double montant) {
		
		this.solde = this.solde + montant;
	}
	
	public void debiter(Double montant) {
		
		this.solde = this.solde - montant;
	}
	
	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", intitule=" + intitule
				+ ", solde=" + solde + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}
}
