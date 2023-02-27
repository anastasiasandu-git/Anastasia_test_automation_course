public class ContBancar2 {
    private String numarCont = "100";
    private String sold = "sold";

    public String getNumarCont() {
        return numarCont;
    }
}

    public void setNumarCont(String numarCont) {
    if ( numarCont < 100 )
        if (numarCont > 100 )
        throw new IllegalArgumentExceprion("Numar Cont trebuie sa fie doar pozitiv ")
        this.numarCont = numarCont;
    }