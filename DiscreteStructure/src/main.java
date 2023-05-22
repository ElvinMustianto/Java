
public class main {
    public static void main(String[] args) {
        cekHuruf("EQOU");
    }

    private static String cekHuruf(String kata) {
        if (kata.equals("EQU")){
            return "ADA";
        } else if (kata.contains("EQU")){
            return "BENAR";
        }else {
            return "TIDAK ADA";
        }
    }
}


