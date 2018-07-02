public enum Kierunki {
    NORTH ("polnoc", 0), EAST ("wschod", 1), SOUTH ("poludnie", 2), WEST ("zachod", 3), UNDEFINE ("", -1);


    private final  String kierunki;
    private final int numer;

    Kierunki(String kierunki, int numer) {
        this.kierunki = kierunki;
        this.numer = numer;
    }

    public String getKierunki() {
        return kierunki;
    }

    public int getNumer() {
        return numer;
    }



    public static String print(){
        String result = "Dostepne kierunki: [ ";
        Kierunki [] kierunki = Kierunki.values();
        for (Kierunki kierunke : kierunki) {
            if (kierunke.numer>=0) {
                result += kierunke + ", ";
            }
        }
        return result+" ] ";
    }

    public static Kierunki convert(int numer) {
        Kierunki result = UNDEFINE;
        Kierunki[] kierunek = Kierunki.values ( );
        for (Kierunki kier : kierunek) {
            if (kier.numer == numer) {
                result = kier;
            }

        }
        return result;
    }
}

