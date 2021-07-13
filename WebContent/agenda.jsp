<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.Contato"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Contato> lista = (ArrayList<Contato>) request.getAttribute("contatos");
/*for (int i = 0; i < lista.size(); i++) {
	out.println(lista.get(i).getIdcontato());
	out.println(lista.get(i).getNome());
	out.println(lista.get(i).getTelefone());
	out.println(lista.get(i).getEmail());
}*/
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Agenda de Contatos</title>
<link rel="icon" href="imgs/telefone.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Agenda de contatos</h1>
	<a href="novo.html" class="botao1">Novo Contato</a>
	<table class="tabelaContatos">
		<thead>
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Telefone</th>
				<th>Contato</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				<td>
					<%
						out.println(lista.get(i).getIdcontato());
					%>
				</td>
				<td>
					<%
						out.println(lista.get(i).getNome());
					%>
				</td>
				<td>
					<%
						out.println(lista.get(i).getTelefone());
					%>
				</td>
				<td>
					<%
						out.println(lista.get(i).getEmail());
					%>
				</td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>