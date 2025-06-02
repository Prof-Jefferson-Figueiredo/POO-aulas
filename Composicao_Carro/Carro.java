public class Carro {
    String modelo;
    String marca;
    int ano;
    float km; //Quilometragem

    Carro(String modelo, String marca, int ano){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.km = 0;
    }

    public String toString(){
        return "\nCARRO"+
                "\nModelo: "+this.modelo+
                "\nMarca: "+this.marca+
                "\nAno: "+this.ano+
                "\nQuilometragem: "+this.km;
    }
}
