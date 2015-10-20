<!DOCTYPE html>
<meta charset="UTF-8">
<html>
<head>
	<title>Exercicio HTML+PHP</title>
</head>
<body>
<table border="4" width="25%">
<tr>
	<td align="middle"><strong>Nome</strong></td>
	<td align="middle"><strong>Quant</strong></td>
	<td align="middle"><strong>Preço</strong></td>
	<td align="middle"><strong>Total</strong></td>
</tr>
<?php 
	$tabela [0] [0] = "DVD";
	$tabela [0] [1] = "5";
	$tabela [0] [2] = "1.00";
	$tabela [1] [0] = "PenDrive 4GB";
	$tabela [1] [1] = "8";
	$tabela [1] [2] = "23.00";
	$tabela [2] [0] = "Mouse";
	$tabela [2] [1] = "10";
	$tabela [2] [2] = "15.00";

	$valor_dvd = $tabela [0] [2] * $tabela [0] [1];
	$valor_pen = $tabela [1] [2] * $tabela [1] [1];
	$valor_mou = $tabela [2] [2] * $tabela [2] [1];
	$total = $valor_pen + $valor_mou + $valor_dvd;

		echo "<tr> <td>" . $tabela[0] [0] . "</td>" .  //pimeira linha
		"<td>" . $tabela [0] [1] . "</td>" . 
		"<td>" . $tabela [0] [2] . "</td>" .
		"<td>R$ " . number_format($valor_dvd,2,',','.') . "</td> </tr>"; //função number_format 

		echo "<tr> <td>" . $tabela [1] [0] . "</td>" .  //segunda linha
		"<td>" . $tabela [1] [1] . "</td>" . 
		"<td>" . $tabela [1] [2] . "</td>" . 
		"<td>R$ " . number_format($valor_pen,2,',','.') . "</td> </tr>";

		echo "<tr> <td>" . $tabela [2] [0] . "</td>" .  //terceira linha
		"<td>" . $tabela [2] [1] . "</td>" . 
		"<td>" . $tabela [2] [2] . "</td>" . 
		"<td>R$ " . number_format($valor_mou,2,',','.') . "</td> </tr>";

		echo "<tr><td colspan=3 align=end><strong> Total </strong></td>" .  //colspan=3 ->  a célula ocupa 3 linhas
		"<td> R$ " . number_format($total,2,',','.') . "</td></tr>";
?>
</table>
</table>
</body>
</html>