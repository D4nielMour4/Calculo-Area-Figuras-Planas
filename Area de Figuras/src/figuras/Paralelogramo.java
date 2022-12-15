package figuras;

public class Paralelogramo extends ModeloFiguras {
    //Atributos
    double base;
    double altura;
    
    //Metodos
    @Override
    public double Tipofigura() {
        return getBase() * getAltura();
    }
    public Paralelogramo(){
        this.altura = getAltura();
        this.base = getBase();        
    }
    
    public double Tipofigura(double base,double altura){
        return this.base * this.altura;
    }
}
