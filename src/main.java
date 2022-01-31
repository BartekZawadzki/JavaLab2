import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {


        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        /*int licznik = 0;

        while(licznik<1001) {
            System.out.println(licznik);
            licznik++;
        }
            //nr indeksu 56581
        if(81%2==0) {
            System.out.println("Liczba 81 podzielna przez 2");
        }
        else
        {
            System.out.println("Liczba 81 nie podzielna przez 2");
        }*/

              /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
            /*Random rand = new Random();
            int[] tab = new int[5];
        System.out.println("Początek tablicy int");
        int i = 0;
        while(i < 5){
            System.out.println(i++);
            for (int i = 0; i < 5; i++) {
                tab[i] = i + 1;
                System.out.println(tab[i]);
            }
        }
        System.out.println("Koniec tablicy int");
        double[] tab2 = new double[5];
        System.out.println("Początek tablicy dobule");
        for (int i = 0; i < 5; i++) {
            tab2[i] = i + 1;
            System.out.println(tab2[i]);



        }
        System.out.println("Koniec tablicy double");*/
        /*String[] tab3 = {"slowo1","slowo2","slowo3","slowo4","slowo5"};
        System.out.println("Początek tablicy string");
        for (String i : tab3) {
            System.out.println(i);
        }
        System.out.println("Koniec tablicy string");*/

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false) nie da się
        */
            /*int k = 10;
            while (true) {
                System.out.println(k++);
            }*/
            /* ćw.2 pętle for */

            /* zad.1 Napisz program który będzie iterował od 100 do 0,
             *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
             * (jesli tą liczbą jest 0 to przez 2 ostatnie) nr indeksu 56581 */
            /*int i = 100;
            System.out.println("\n");
            do {
                if (i/1 > 0) {
                    System.out.println(i);
                }
            }while (i-- > 0);*/



            /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
             * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
             * za pomocą pętli forEach powiększone o 11 */
            /*Scanner scan = new Scanner(System.in);
            int[] tab = new int[5];
            System.out.println("Podaj elementy tablicy");
            tab[0] = scan.nextInt();
            //System.out.println(tab[0]);
            tab[1] = scan.nextInt();
            //System.out.println(tab[1]);
            tab[2] = scan.nextInt();
            //System.out.println(tab[2]);
            tab[3] = scan.nextInt();
            //System.out.println(tab[3]);
            tab[4] = scan.nextInt();
            //System.out.println(tab[4]);

            for(int x : tab){
                System.out.println(x + 11);*/


            /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */
              /*Scanner scan = new Scanner(System.in);
              System.out.println("Podaj swoją liczbę");
              int x = scan.nextInt();
              System.out.println("Twoja liczba to " + x);

              switch (x) {
                  default:
                      if(x%2==0&&x%7==0){
                          System.out.println("liczba " + x + " jest parzysta oraz podzielna przez 7");
                      }
                      else if(x%2!=0&&x%7!=0){
                          System.out.println("Twoja liczba nie jest parzysta i nie jest podzielna przez 7");
                      }
                      else if(x%2!=0&&x%7==0){
                          System.out.println("Twoja liczba nie jest parzysta ale jest podzielna przez 7");
                      }
                      else if(x%2==0&&x%7!=0){
                          System.out.println("Twoja liczba jest parzysta ale nie jest podzielna przez 7");
                      }
              }*/




        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        int ile_liter = 0;
        String slowo = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        char o,p,x,z,q;
        for (int i = 0 ; i < slowo.length() ; i++){
       /* o = slowo.charAt(i);
        p = slowo.charAt(i);
        x = slowo.charAt(i);
        z = slowo.charAt(i);
        q = slowo.charAt(i);*/
            o = slowo.charAt(i);
        if(o == slowo.charAt(i)) {
            ile_liter++;
            //System.out.println("Liter o jest: " + );
        }
           
        /*else if (p == slowo.charAt(i)) {
              ile_liter++;
            System.out.println("Liter p jest: " + ile_liter);
            }else if (x == slowo.charAt(i)) {
            ile_liter++;
            System.out.println("Liter x jest: " + ile_liter);
        }else if (z == slowo.charAt(i)) {
            ile_liter++;
            System.out.println("Liter z jest: " + ile_liter);
        }else if (q == slowo.charAt(i)) {
            ile_liter++;
            System.out.println("Liter q jest: " + ile_liter);
        }*/
        }


            /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */


        /*for(int i = 0; i <= 100; i++) {
            System.out.println("x");
            if (i == 30) {
                System.out.println(i);
                break;
            }*/
            /*for(int i = 0; i <= 100; i++) {
                System.out.println("x");
                if (i == 30) {
                    System.out.println(i);
                    continue;
                }*/
                /*for(int i = 0; i <= 100; i++) {
                    System.out.println("x");
                    if (i == 30) {
                        System.out.println(i);
                        return;
                    }*/
        }
        }



