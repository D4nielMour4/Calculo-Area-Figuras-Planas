package figuras;


public class Triangulo extends ModeloFiguras{
    //Atributos
    double base;
    double altura;
    @Override
    public double Tipofigura(){
        return (getBase()*getAltura()) / 2;
    }
    
    public Triangulo(){
        this.base = getBase();
        this.altura = getAltura();
    }
    
    public double Tipofigura(double base, double altura){
        return (this.base * this.altura) / 2;
    }
}
