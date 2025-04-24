public class Main{
    public static void main(String[] args) {
        Pessoa A = new Pessoa(32,1.85f,75);
        Pessoa B = new Pessoa(15,1.7f,78);
        Pessoa C = new Pessoa(18,1.57f,89.92f);

        System.out.println("Pessoa A:\n"+A);
        System.out.println("Pessoa B:\n"+B);
        System.out.println("Pessoa C:\n"+C);


        Carro X = new Carro("HB20","Hyundai",2024);
        Carro Y = new Carro("Chevete","Chevrolet",1995);
        Y.km = 200750.350f;

        System.out.println(X);
        System.out.println(Y);


    }
}
