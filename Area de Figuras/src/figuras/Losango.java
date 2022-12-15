package figuras;

public class Losango extends ModeloFiguras {
    //Atributos
    double diagonalMenor;
    double diagonalMaior;
    
    //Metodos
    @Override
    public double Tipofigura() {
        return (getDiagonalMaior() * getDiagonalMenor()) / 2;
    }
    
    public Losango(){
        this.diagonalMaior = getDiagonalMaior();
        this.diagonalMenor = getDiagonalMenor();
    }
    
    public double Tipofigura(double diagonalMaior, double diagonalMenor){
        return (this.diagonalMaior * this.diagonalMenor) / 2;
    }
}
