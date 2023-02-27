public class Vehicul {

    String culoare;
    String nrRoti;
    String afiseazaDetaliiVehicul;

    public Vehicul() {}

    public String getCuloare() {
        return culoare;
    }
    public String getNrRoti() {
        return nrRoti;
    }

    public void setCuloare(String culoare) {
        System.out.println("afiseazaDetaliiVehicul" + culoare);
    }
}
