package model;

public class Contato {
	private String idcontato;
	private String nome;
	private String telefone;
	private String email;

	public String getIdcontato() {
		return idcontato;
	}

	public void setIdcontato(String idcontato) {
		this.idcontato = idcontato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Contato() {
		super();
	}

	public Contato(String idcontato, String nome, String telefone, String email) {
		super();
		this.idcontato = idcontato;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

}
