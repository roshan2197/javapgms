<?php
$num1=$_POST["fnum"];
$num2=$_POST["Snum"];
$op=$_POST["op"];
if($num1=="" or $num2=="")
echo "please Enter Two Numbers";
else{
    echo " First Number is : " .$num1. "<br>";
    echo " Second Number is : " .$num2. "<br>";
    echo" Operator is : " .$op. "<br>";
    if($op == "+"){
    echo "Addition is " .($num1+$num2). "<br>";}
if($op == "-"){
    echo "Subtraction is " .($num1-$num2). "<br>";}
if($op == "*"){
    echo "Multiplication is " .($num1*$num2). "<br>";}
if($op == "/"){
    echo "Division is " .($num1/$num2). "<br>";}
if($op == "%"){
    echo "Modulus is " .($num1%$num2). "<br>";}
}

?>