package pl.edu.wszib.java;

public class PackagePresenter {

    public PackagePresenter(){
        System.out.println("sobota");
    }
    public void showPackage(){
        System.out.println("To jest obiekt klasy " + this.getClass().getName() + ", w pakiecie " + getClass().getPackage());
    }

    public static void main(String[] args) {
        PackagePresenter packagePresenter = new PackagePresenter();
        packagePresenter.showPackage();
    }
}
