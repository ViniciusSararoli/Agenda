package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ContatoDAO {
	private String url = "jdbc:mysql://localhost:3306/agenda";
	private String user = "root";
	private String password = "";

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/*
	 * public void testeConexao() { try { Connection con = conectar();
	 * System.out.println(con); con.close(); } catch (Exception e) {
	 * System.out.println(e); } }
	 */

	public void inserirContatos(Contato contato) {
		String create = "insert into contatos (nome, telefone,email) values(?,?,?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);

			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getTelefone());
			pst.setString(3, contato.getEmail());

			pst.executeUpdate();

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public ArrayList<Contato> listarContatos() {
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		String select = "select * from contatos order by nome asc";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(select);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String idcontato = rs.getString(1);
				String nome = rs.getString(2);
				String telefone = rs.getString(3);
				String email = rs.getString(4);
				contatos.add(new Contato(idcontato, nome, telefone, email));
			}
			con.close();
			return contatos;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
