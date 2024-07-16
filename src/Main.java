import java.util.ArrayList;

public class Main {

    public String name;

    protected  int salary;

    public static void main(String[] args) {
        Ser meuSerAnimal = new Cachorro("ndjfj", 2, "Marcos");
        Ser meuSerHumano = new pessoa("Marcos", "paulo", 22);
        meuSerAnimal.setNome("Marcos");
        System.out.println(meuSerAnimal.saudacao());
        System.out.println(meuSerHumano.saudacao());


    }
    private void atualizaSalario(){
        this.salary = 4000;
    }

    public int getSalary() {
        this.atualizaSalario();
        return this.salary;
    }
}