import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println (Kierunki.print ( ));

        Scanner sc = new Scanner (System.in);

        System.out.print ("Podaj kierunek: ");

        Kierunki twójKierunek = Kierunki.valueOf (sc.nextLine ());


        System.out.println ("OK, wiec idziemy na " + twójKierunek.getKierunki ( ));

        twójKierunek = Kierunki.convert (3);

        System.out.println (twójKierunek.getKierunki ( ));
    }

}

