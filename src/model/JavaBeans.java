package model;

public class JavaBeans {
	private String idcontato;
	private String telefone;
	private String email;
	
	public String getIdcontato() {
		return idcontato;
	}
	public void setIdcontato(String idcontato) {
		this.idcontato = idcontato;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public JavaBeans() {
		super();
	}
	
	public JavaBeans(String idcontato, String telefone, String email) {
		super();
		this.idcontato = idcontato;
		this.telefone = telefone;
		this.email = email;
	}
	
	
}
