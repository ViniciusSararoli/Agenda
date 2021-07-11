document.getElementById("adicionarContato").onclick = function Validar() {
	/*var nome = document.getElementsByName("nome")[0];
	var telefone = document.getElementsByName("telefone")[0];
	if(nome.value == "") {
		nome.style.border = "2px solid #FF0000";
		nome.focus();
		return false;
	} else if(telefone.value == "") {
		telefone.style.border = "2px solid #FF0000";
		telefone.focus();
		return false;
	} else {
		telefone.style.border = "1px solid #66bbff";
		nome.style.border = "1px solid #66bbff";
		document.getElementsByName("frmContato")[0].submit();
	}*/
	let nome = frmContato.nome.value;
	let telefone = frmContato.telefone.value;
	let email = frmContato.email.value;
	
	if(nome == "") {
		frmContato.nome.focus();
		return false;
	} else if( telefone == "") {
		frmContato.telefone.focus();
		return false;
	} else {
		document.forms['frmContato'].submit();
	}
	
}