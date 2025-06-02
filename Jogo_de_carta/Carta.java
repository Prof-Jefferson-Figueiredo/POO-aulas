public class Carta {
    int valor;
    String naipe;
    String simbolo;

    Carta(int valor, String naipe){
        this.valor = valor;
        this.naipe = naipe;

        switch (valor){
            case 1:
                this.simbolo = "A";
                break;
            case 11:
                this.simbolo = "J";
                break;
            case 12:
                this.simbolo = "Q";
                break;
            case 13:
                this.simbolo = "K";
                break;
            default:
                this.simbolo = ""+valor;
                break;
        }
    }

    public String toString() {
        return this.simbolo+" "+this.naipe;
    }
}
