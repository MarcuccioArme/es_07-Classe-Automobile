import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char Scelta;
        String Marca = "";
        String Colore = "";
        Double Cilindrata;
        Double Serbatoio;

        System.out.println("Inserisci la marca: ");
        Marca = in.next();

        System.out.println("Inserisci il colore: ");
        Colore = in.next();

        System.out.println("Inserisci la cilindrata: ");
        Cilindrata = in.nextDouble();

        System.out.println("Inserisci la capacità del serbatoio: ");
        Serbatoio = in.nextDouble();

        Automobile aut1 = new Automobile(Marca, Colore, Cilindrata, Serbatoio);

        System.out.println("\nVuoi avviare il motore? S o N");
        Scelta = in.next().charAt(0);

        if (Scelta == 's' || Scelta == 'S') {
            aut1.AvviaMotore();
        }

        System.out.println("\nIl serbatoio è di capienza "+aut1.getSerbatoio()+" litri. Vuoi riempirlo? S o N");
        Scelta = in.next().charAt(0);

        if (Scelta == 's' || Scelta == 'S') {
            aut1.RifornimentoLitri();
        }

        aut1.Visualizza();

    }
}