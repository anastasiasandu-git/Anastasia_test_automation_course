public class ContBancar {
    String numarCont = "100";
    String sold = "sold";

    }
    public Integer getnumarCont() { return numarCont; }

    public void setNumarCont(Integer numarCont) {
    if ( numarCont < 100 )
        if (numarCont > 100 )
        throw new IllegalArgumentExceprion("Numar Cont trebuie sa fie doar pozitiv ")
        this.numarCont = numarCont;
    }