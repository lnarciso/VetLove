package model;

public class Clientes {
	
	private int idCli;
	private String NomeCli;
	private String MoradaCli;
	private String EmailCli;
	private int TelCli;
	
	public Clientes(int idCli, String nomeCli, String moradaCli, String emailCli, int telCli) {
		super();
		this.idCli = idCli;
		NomeCli = nomeCli;
		MoradaCli = moradaCli;
		EmailCli = emailCli;
		TelCli = telCli;
	}

	public int getIdCli() {
		return idCli;
	}

	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}

	public String getNomeCli() {
		return NomeCli;
	}

	public void setNomeCli(String nomeCli) {
		NomeCli = nomeCli;
	}

	public String getMoradaCli() {
		return MoradaCli;
	}

	public void setMoradaCli(String moradaCli) {
		MoradaCli = moradaCli;
	}

	public String getEmailCli() {
		return EmailCli;
	}

	public void setEmailCli(String emailCli) {
		EmailCli = emailCli;
	}

	public int getTelCli() {
		return TelCli;
	}

	public void setTelCli(int telCli) {
		TelCli = telCli;
	}
	
	
	
}
