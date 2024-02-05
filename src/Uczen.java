import java.util.Objects;

public class Uczen {
    private final String imie;
    private final String nazwisko;
    private final int wiek;
    private final String klasa;

    public Uczen(String imie, String nazwisko, int wiek, String klasa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.klasa = klasa;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public String getKlasa() {
        return klasa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczen uczen = (Uczen) o;
        return wiek == uczen.wiek && Objects.equals(imie, uczen.imie) && Objects.equals(nazwisko, uczen.nazwisko) && Objects.equals(klasa, uczen.klasa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, wiek, klasa);
    }

    @Override
    public String toString() {
        return String.format("Imię: %s\n Nazwisko: %s\n Wiek: %d\n Klasa: %s\n", imie, nazwisko, wiek, klasa);
    }
}