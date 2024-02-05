import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Uczen uczen1 = new Uczen("Michu", "Michu", 24, "3tp");
        Uczen uczen2 = new Uczen("Michu", "Michałowski", 8, "3tp");
        Uczen uczen3 = new Uczen("Gojciech", "Wontarek", 17, "3tp");
        Uczen uczen4 = new Uczen("Krystian", "Horda lubi forda", 20, "3tp");
        Uczen uczen5 = new Uczen("Roch", "Drgas", 15, "3tp");

        ArrayList<Uczen> uczniowie = new ArrayList<>();

        uczniowie.add(uczen1);
        uczniowie.add(uczen2);
        uczniowie.add(uczen3);
        uczniowie.add(uczen4);
        uczniowie.add(uczen5);

        System.out.println(uczniowie);
    }
}