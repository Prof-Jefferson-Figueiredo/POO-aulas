public class Pessoa {
    int idade;
    float altura;
    float peso;

    Pessoa(int i, float alt, float p){
        this.idade = i;
        this.altura = alt;
        this.peso = p;
    }

    public String toString(){
        return "Idade: "+this.idade+"\nPeso: "+this.peso+
                "\nAltura: "+this.altura+
                "\n\n-----------------------------------";
    }
}

