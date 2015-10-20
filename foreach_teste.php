<!DOCTYPE html>
<meta charset="UTF-8">
<html>
<head>
	<title></title>
</head>
<body>
<?php
	$vetor = array (1,2,3,4);
	foreach ($vetor as $v){
		echo "o valor atual do vetor é $v . <br>";
	}

	$a = array ("um" => 1, "dois" => 2, "tres" => 3);
	foreach ($a as $nome => $valor){
		echo "\$a[$nome] => $valor . <br>";
	}
?>
</body>
</html>