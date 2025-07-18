import java.util.ArrayList;

public class Main {
    //Polimorfismo = muitas formas
    static void alimentar(Animal x){
        x.alimentar();
    }

    public static void main(String[] args) {
        ArrayList<Animal> celeiro = new ArrayList<>();
        celeiro.add(new Animal());
        celeiro.add(new Boi());
        celeiro.add(new Cachorro());
        celeiro.add(new Frango());
        celeiro.add(new Gato());

        for(Animal x :celeiro){
            System.out.println(x);
        }
    }
}
