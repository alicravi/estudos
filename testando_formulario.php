<!DOCTYPE html>
<meta charset="UTF-8">
<html>
<head>
	<title>TESTE DE FORMULÁRIO</title>
</head>
<body>
<form action="programa_teste.php" method="POST">
	<p><strong>Entre com seus dados</strong>
<pre>
	<strong>Nome</strong>
	<input type="text" name="nome" size="35" maxlength="256">
	<strong>E-mail</strong>
	<input type="text" name="email" size="35" maxlength="256">
	<strong>Endereço</strong>
	<input type="text" name="end" size="35" maxlength="256"> <strong>Complemento</strong> <input type="text" name="comp" size="20" maxlength="50">
	<strong>Telefone</strong>
	<input type="text" name="tel" size="35" maxlength="10">
</pre>
	<p><strong>Estado Civil</strong>
	<select name="estado civil" size="1">					
		<option value="solteiro">Solteiro</option>
		<option value="casado">Casado</option>	
		<option value="divorciado">Divorciado</option>
		<option value="viuvo">Viúvo</option>
	</select>
	<strong>Quantidade de filhos</strong>
	<select name="filhos" size="1">
		<option value="1">1 Filho</option>
		<option value="2">2 Filhos</option>
		<option value="3">3 Filhos</option>
		<option value="4 ou mais">4 ou mais</option>
	</select>
	<p><input type="submit"  value="Enviar!">
	<input type="reset" value="Limpar campos!">
</form>
</body>
</html>