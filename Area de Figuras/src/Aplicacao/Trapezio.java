package Aplicacao;


public class Trapezio extends Modelo{

    @Override
    public double Tipofigura() {
        return ((getBaseMenor() + getBase()) / 2) * getAltura();
    }
    
}
