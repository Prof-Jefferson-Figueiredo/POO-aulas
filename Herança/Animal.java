public class Animal {
    String alimentacao;
    float altura;

    Animal(String alimentacao){
        this.alimentacao = alimentacao;
        this.altura = 0.5f;
    }

    Animal(){
        this("Carnívoro");
    }

    void fazer_barulho(){
        System.out.println("HAAAAAAAA");
    }

    public String toString(){
        String especie = (this.getClass()).getSimpleName();
        return "Animal "+this.alimentacao+ " do tipo: "+especie +
                " com "+altura+" metros de altura";
    }

    public void alimentar() {
        String especie = (this.getClass()).getSimpleName();
        if(this.alimentacao == "Carnívoro"){
            System.out.println("O "+especie+" comeu carne");
        }else{
            System.out.println("O "+especie+" comeu vegetais");
        }
    }
}
