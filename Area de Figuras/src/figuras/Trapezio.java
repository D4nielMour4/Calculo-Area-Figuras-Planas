package figuras;

public class Trapezio extends ModeloFiguras{
    //Atributos
    double base;
    double baseMenor;
    double altura;
    
    //Metodos
    @Override
    public double Tipofigura() {
        return ((getBaseMenor() + getBase()) / 2) * getAltura();
        
    }
    
    public Trapezio(){
        base = getBase();
        altura = getAltura();
        baseMenor = getBaseMenor();
    }
    
    public double Tipofigura(double base, double baseMenor, double  altura){
        return ((this.baseMenor + this.base) / 2) * this.altura;
    }
}
