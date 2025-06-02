import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
    private ArrayList<Carta> deck;

    Baralho(){
        this.deck = new ArrayList<>();
        this.gerarBaralho();
    }

    Baralho(boolean embaralhado){
        this();
        if(embaralhado){
            this.embaralhar();
        }
    }

    void gerarBaralho(){
        String naipes[] ={"♦️","♥️", "♣️", "♠️"};

        for(String naipe: naipes){
            for(int i=1; i<=13;i++){
                this.deck.add(new Carta(i,naipe));
            }
        }
    }
    void embaralhar(){
        Collections.shuffle(this.deck);
    }
    Carta puxarCarta(){
        Carta C = this.deck.getFirst();
        this.deck.removeFirst();
        return C;
    }

    public String toString(){
        return ""+this.deck;
    }
}
