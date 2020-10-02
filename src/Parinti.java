public class Parinti {

    String numMicBarbat;
    String numMicFemeie;
    String[] anumFam = {"Ionescu", "Popescu", "Georgescu", "Protopopescu", "Eftimie", "Pop", "Ciobanu", "Rusu"};
    String[] anumMicBarbat = {"Dan", "Mihai", "Alin", "Ion", "Alexandru", "Vasile", "Matei", "Andrei"};
    String[] anumMicFemeie = {"Mihaela", "Dana", "Elena", "Ileana", "Cerasela", "Andreea", "Ligia", "Petronela"};

    public Parinti(String NumeFamilie) {


        numMicBarbat = genNumB() + " " + NumeFamilie;
        numMicFemeie = genNumF() + " " + genNumFam();

    }

    public String genNumB() {

        return  anumMicBarbat[(int) (Math.random() * 8)];
    }

    public String genNumF() {
        return  anumMicFemeie[(int) (Math.random() * 8)];
    }

    public String genNumFam() {
        return  anumFam[(int) (Math.random() * 8)];
    }
}
