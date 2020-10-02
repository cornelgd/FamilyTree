import java.util.Scanner;

public class Main {
    public static boolean barbat = true;


    public static void main(String[] args) {
        int lev = Integer.parseInt(args[2]);
        String NumeFamilie = args[1];
        String numeTata = null, numeMama = null;
        int maxy = (int) Math.pow(2, lev + 1);
        String[][] numeParinti = new String[lev][maxy];


        for (int x = 0; x < (lev); x++) {
            for (int y = 0; y < ((int) Math.pow(2, x + 1)); y += 2) {
                if (x != 0) {
                    NumeFamilie = numeParinti[x - 1][y / 2].split(" ")[1];
                    Parinti parinti = new Parinti(NumeFamilie);
                    int k = y + 1;
                    numeTata = parinti.numMicBarbat;
                    numeMama = parinti.numMicFemeie;
                    numeParinti[x][y] = numeTata;
                    numeParinti[x][k] = numeMama;
                    System.out.print( "T=" + numeParinti[x][y] +  " M=" + numeParinti[x][k] + " ");
                } else {
                    Parinti parinti = new Parinti(NumeFamilie);

                    int k = y + 1;
                    numeTata = parinti.numMicBarbat;
                    numeMama = parinti.numMicFemeie;
                    numeParinti[x][y] = numeTata;
                    numeParinti[x][k] = numeMama;
                    System.out.print("T=" + numeParinti[x][y] +  " M=" + numeParinti[x][k] + " ");

                }
            }
            System.out.println();
        }

        System.out.println("Introduceti numele persoanei pentru care sa gasesc parintii");
        Scanner n = new Scanner(System.in);
        String nume = n.nextLine();
        findNume(numeParinti, nume, lev);


    }

    public static void findNume(String[][] numeParinti, String nume, int lev) {
        boolean gasit = false;

        for (int x = 0; x < (lev); x++) {
            for (int y = 0; y < ((int) Math.pow(2, x + 1)); y++) {
                try {
                    if (numeParinti[x][y].equals(nume)) {
                        System.out.println("Gasit tatal " + numeParinti[x + 1][y * 2] + " si mama " + numeParinti[x + 1][y * 2 + 1]);
                        gasit = true;
                    }


                } catch (Exception ArrayIndexOutOfBoundsException) {
                    System.out.println("Gasit persoana, dar nu am gasit in arborele genealogic cunoscut parintii");
                    return;
                }

            }
            }
        if (!gasit )
        {
            System.out.println("Nu am gasit persoana respectiva");
        }
        }


    }


