package figuras;

public class Quadrado extends ModeloFiguras{
    //Atributos
    double base;
    
    //Metodos
    @Override
    public double Tipofigura(){
        return Math.pow(getBase(), 2);
    }
    
    public Quadrado(){
        this.base = getBase();
    }
    
    public double Tipofigura(double base){
        return Math.pow(this.base, 2);
    }
}
