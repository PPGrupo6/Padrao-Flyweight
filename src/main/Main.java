package main;

public class Main {

    //BRUNO CORONA BRAGA, GABRIEL MONTEIRO, RAPHAELLA RANIERI
    public static void main(String[] args) {
        FabricaUnidades fabrica = new FabricaUnidades();


        UnidadeFlyweight soldado1 = fabrica.getUnidade("soldado");
        UnidadeFlyweight soldado2 = fabrica.getUnidade("soldado");
        UnidadeFlyweight soldado3 = fabrica.getUnidade("soldado");


        UnidadeFlyweight tanque1 = fabrica.getUnidade("tanque");
        UnidadeFlyweight tanque2 = fabrica.getUnidade("tanque");


        soldado1.renderizar(10, 20);
        soldado2.renderizar(30, 40);
        soldado3.renderizar(50, 60);
        tanque1.renderizar(100, 200);
        tanque2.renderizar(150, 250);
    }
}
