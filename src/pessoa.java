
public class pessoa extends Ser {

    String sobreNome;

    public pessoa (String nome, String sobreNome, int idade){
        super(nome, idade);
        this.sobreNome = sobreNome;
    }

    void criaMain(){
        Main meuMain = new Main();
        System.out.println(meuMain.name);
        System.out.println(meuMain.salary);
        this.idade = 22;
    }

    @Override
    public String saudacao(){
        return "Ola meu nome é " + this.nome;
    }
}
