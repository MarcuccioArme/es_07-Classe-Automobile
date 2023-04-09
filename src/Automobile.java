import java.util.Scanner;

public class Automobile {

    Scanner in = new Scanner(System.in);

    private String Marca;
    private String Colore;
    private double Cilindrata;
    private boolean StatoMotore = false;
    private double Serbatoio;
    private float Litri = 0;

    public Automobile (String Marca, String Colore, double Cilindrata, double Serbatoio) {
        this.Marca = Marca;
        this.Colore = Colore;
        this.Cilindrata = Cilindrata;
        this.Serbatoio = Serbatoio;
    }

    public void AvviaMotore() {
        StatoMotore = true;
        System.out.println("Hai acceso il motore");
    }

    public void RifornimentoLitri() {

        System.out.println("Inserisci i litri: ");
        Litri = in.nextFloat();

        if (Litri > this.Serbatoio) {
            do {
                System.out.println("Hai superato la capacità massima del serbatoio");
                System.out.println("\nInserisci i litri: ");
                Litri = in.nextFloat();
            }while (Litri > this.Serbatoio);
        }
        else {
            System.out.println("Hai aggiunto "+Litri+" litri");
        }
    }

    public double getSerbatoio() {
        return Serbatoio;
    }

    public String toString() {
        String s;
        s = ("\nMarca: " + this.Marca + "\nColore: " + this.Colore + "\nCilindrata: " + this.Cilindrata + "\nSerbatoio: " + Litri + " litri");
        return s;
    }

    public void Visualizza() {
        System.out.println(toString());
    }

}