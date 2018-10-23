package ba.unsa.etf;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        boolean running = true;
        Predmet noviPredmet = null;
        Student noviStudent = null;

        //Jednostavnija verzija programa
        while(running) {
            System.out.println("0 - Kraj");
            System.out.println("1 - Kreiraj novi predmet (naziv, sifra, max)");
            System.out.println("2 - Kreirej novog studenta (ime, prezime, index)");
            System.out.println("3 - Upisi studenta (index)");
            System.out.println("4 - Ispisi studenta (index)");
            System.out.println("5 - Izlistaj studente predmeta (sifra)");
            System.out.println("6 - Obrisi studneta (index)");
            System.out.println("7 - Obrisi predmet (sifra)");
            System.out.print("> ");
            input = sc.nextInt();

            int index, sifra, max;
            String ime, prezime, naziv;

            switch(input) {
                case 0:
                    running = false;
                    break;
                case 1:
                    naziv = sc.next();
                    sifra = sc.nextInt();
                    max = sc.nextInt();
                    noviPredmet = new Predmet(naziv, sifra, max);
                    break;
                case 2:
                    ime = sc.next();
                    prezime = sc.next();
                    index = sc.nextInt();
                    noviStudent = new Student(ime, prezime, index);
                    break;
                case 3:
                    if(noviPredmet != null)
                        if(noviStudent != null)
                            noviPredmet.upisi(noviStudent);
                        else
                            System.out.println("Ne postoji student");
                    else
                        System.out.println("Ne postoji predmet");
                    break;
                case 4:
                    if(noviPredmet != null)
                        if(noviStudent != null)
                            noviPredmet.ispisi(noviStudent);
                        else
                            System.out.println("Ne postoji student");
                    else
                        System.out.println("Ne postoji predmet");
                    break;
                case 5:
                    if(noviPredmet != null)
                        System.out.println(noviPredmet);
                    else
                        System.out.println("Ne postoji predmet");
                    break;
                case 6:
                    noviStudent = null;
                    break;
                case 7:
                    noviPredmet = null;
                    break;
            }

        }

        System.out.println("Kraj programa.");
    }
}
