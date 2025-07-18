import java.util.ArrayList;

public class Main {
    //Polimorfismo = muitas formas
    static void alimentar(Animal x){
        x.alimentar();
    }

    public static void main(String[] args) {
        ArrayList<Animal> celeiro = new ArrayList<>();

        celeiro.add(new Animal("Herbívoro"));
        celeiro.add(new Boi());
        celeiro.add(new Cachorro());
        celeiro.add(new Gato());

        System.out.println(celeiro);

        for(Animal x : celeiro){
            x.fazer_barulho();
        }
    }
}