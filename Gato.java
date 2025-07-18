public class Gato extends Animal{
    Gato(){
        super();
        this.altura = 0.3f;
    }

    @Override
    void fazer_barulho() {
        System.out.println("Miau!");
    }
}
