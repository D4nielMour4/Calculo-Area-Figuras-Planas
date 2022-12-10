package Aplicacao;


public abstract class Modelo {
    //Atributos
    private String figura;
    private double base;
    private double altura;
    private double baseMenor;
    private double diagonalMaior, diagonalMenor;
    //metodos
    public abstract double Tipofigura();

    /**
     * @return the figura
     */
    public String getFigura() {
        return figura;
    }

    /**
     * @param figura the figura to set
     */
    public void setFigura(String figura) {
        this.figura = figura;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }


    /**
     * @return the diagonalMaior
     */
    public double getDiagonalMaior() {
        return diagonalMaior;
    }

    /**
     * @param diagonalMaior the diagonalMaior to set
     */
    public void setDiagonalMaior(double diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }

    /**
     * @return the diagonalMenor
     */
    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    /**
     * @param diagonalMenor the diagonalMenor to set
     */
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    /**
     * @return the baseMenor
     */
    public double getBaseMenor() {
        return baseMenor;
    }

    /**
     * @param baseMenor the baseMenor to set
     */
    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }
    
}
