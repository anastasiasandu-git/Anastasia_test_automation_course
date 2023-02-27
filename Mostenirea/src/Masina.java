public class Masina extends Vehicul {
    private int marca;

    public Masina(int marca){
        super();
        this.marca = marca;
        super.afiseazaDetaliiVehicul = String.valueOf(marca);

    }

}
