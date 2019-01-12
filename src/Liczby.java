public class Liczby {
    String losowanie;
    int liczba1;
    int liczba2;
    int liczba3;

    public Liczby(String losowanie, int liczba1, int liczba2, int liczba3) {
        this.losowanie = losowanie;
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
        this.liczba3 = liczba3;
    }

    public String getLosowanie() {
        return losowanie;
    }

    public void setLosowanie(String losowanie) {
        this.losowanie = losowanie;
    }

    public int getLiczba1() {
        return liczba1;
    }

    public void setLiczba1(int liczba1) {
        this.liczba1 = liczba1;
    }

    public int getLiczba2() {
        return liczba2;
    }

    public void setLiczba2(int liczba2) {
        this.liczba2 = liczba2;
    }

    public int getLiczba3() {
        return liczba3;
    }

    public void setLiczba3(int liczba3) {
        this.liczba3 = liczba3;
    }
}