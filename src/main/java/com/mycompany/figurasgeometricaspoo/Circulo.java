package com.mycompany.figurasgeometricaspoo;

public class Circulo {

private double radio;


public double obtenerArea(){
double area = 3.1416*(radio*radio);
return area;
    }

public double obtenerPerimetro(){
double perimetro = (2*3.1416)*radio;
return perimetro;    
}
}
