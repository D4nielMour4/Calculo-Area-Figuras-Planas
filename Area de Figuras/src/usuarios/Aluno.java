package usuarios;

public class Aluno extends modeloUsuario{

    @Override
    public String Acesso() {
        return null;
        
    }
    
    public  String Acesso (String nome){
        return  "Bem Vindo Aluno(a): " + nome;
    }
}
