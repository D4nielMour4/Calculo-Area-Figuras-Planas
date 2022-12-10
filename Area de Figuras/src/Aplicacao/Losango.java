package Aplicacao;

public class Losango extends Modelo {

    @Override
    public double Tipofigura() {
        return (getDiagonalMaior() * getDiagonalMenor()) / 2;
    }
    
}
