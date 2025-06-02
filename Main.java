
public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho(true);

        System.out.println(baralho);

        Carta puxada = baralho.puxarCarta();

        System.out.println(baralho);
        System.out.println(puxada);
    }
}