package com.mycompany.figurasgeometricaspoo;

public class Rectangulo {

private double lado1;
private double lado2; 


public double obtenerArea(){
double area = lado1*lado2;
return area;
}

public double obtenerPerimetro(){
double perimetro = (lado1*2)+(lado2*2);
return perimetro;
}
}
