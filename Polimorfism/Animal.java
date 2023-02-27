public class Animal {
    String metodaEmiteSunet;

    Animal(){
        System.out.println("fara parametri");

    }
    Animal(String metodaEmiteSunet){
        this.metodaEmiteSunet = metodaEmiteSunet;
        System.out.println("cunoastem sunetele"+metodaEmiteSunet);

    }

}
