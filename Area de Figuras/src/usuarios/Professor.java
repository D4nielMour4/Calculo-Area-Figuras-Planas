package usuarios;

public class Professor extends modeloUsuario {

    @Override
    public String Acesso() {
        return null;    
    }
    
    public  String Acesso (String nome){
        return  "Bem Vindo Professor(a): " + nome;
    }
    
    
}
