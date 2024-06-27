import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    // É disso aqui que precisamos para criar um carro
    private String nome;
    private String cpf;
    private String email;
    private String escolaridade;
    private String senha;

    public Aluno() {
        this.nome = "Carla"; //this significa esse registro
        this.cpf = "12345678921";
        this.senha = "123456";
        System.out.println("-----------------");
    }

    // O construtor personalizado lá do main
    public Aluno(String nome, String cpf, String email, String escolaridade, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.escolaridade = escolaridade;
        this.senha = senha;
        
    }
    public void mostrarInformacoes() {
        System.out.println("nome: " + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("email: " + this.email);
        System.out.println("escolaridade: " + this.escolaridade);
        System.out.println("senha: " + this.senha);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> usuarios = new ArrayList<>();
        // CONSTRUTOR PADRÃO (NÃO TEM PARÂMETROS, ESTÁ CRIANDO UM CARRO PADRÃO
        usuarios.add(new Aluno());

        // CRIANDO UM CARRO COM UM CONSTRUTOR PERSONALIZADO, COM INFORMAÇÕES SOBRE O CARRO
        usuarios.add(new Aluno("Bianca", "5426318795", "bi@gmail.com", "fundamental", "bibi123"));

        // CRIANDO UM NOVO CARRO COM INFORMAÇÕES DIGITADAS PELO USUÁRIO
        System.out.print("Digite seu nome: ");
        String nomeAluno = sc.next();
        System.out.print("Digite seu cpf: ");
        String cpfAluno = sc.next();
        System.out.print("Digite seu email: ");
        String emailAluno = sc.next();
        System.out.print("Digite sus escolaridade: ");
        String escolaridadeAluno = sc.next();
        System.out.print("Digite sua senha: ");  
        String senhaAluno = sc.next();
        usuarios.add(new Aluno(nomeAluno, cpfAluno, emailAluno, escolaridadeAluno, senhaAluno));
        System.out.println("-----------------");
        sc.close();

        for(Aluno aluno : usuarios){
            aluno.mostrarInformacoes();
        }
    }
}