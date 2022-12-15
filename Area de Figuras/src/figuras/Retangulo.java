package figuras;

public class Retangulo extends ModeloFiguras{
    //Atributos
    double base;
    double altura;
    
    //Metodos
    @Override
    public double Tipofigura(){
        return getBase() * getAltura();
    }
    
    public Retangulo(){
        this.base = getBase();
        this.altura = getAltura();
    }
    
    public double Tipofigura(double base, double altura){
        return this.base * this.altura; 
    }
}
