public class Frango extends Animal{
    Frango(){
        this.alimentacao = "Herbívoro";
    }

    @Override
    void fazer_barulho() {
        System.out.println("Cocoricó!");
    }

    @Override
    public void alimentar() {
        System.out.println("O Frango comeu grãos.");
    }
}
