package Aplicacao;


public class Triangulo extends Modelo{
    @Override
    public double Tipofigura(){
        return (getBase()*getAltura()) / 2;
    }
}
