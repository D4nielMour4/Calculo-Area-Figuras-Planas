package usuarios;


public abstract class modeloUsuario {
    //Atributos
    private String nome;
    private Double codigoDeAcesso;
    //Metodos

    public abstract String Acesso();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCodigoDeAcesso() {
        return codigoDeAcesso;
    }

    public void setCodigoDeAcesso(Double codigoDeAcesso) {
        this.codigoDeAcesso = codigoDeAcesso;
    }
  
}
