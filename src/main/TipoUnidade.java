package main;


public class TipoUnidade implements UnidadeFlyweight {
    private String tipo;
    private String textura;
    private String modelo3D;

    public TipoUnidade(String tipo, String textura, String modelo3D) {
        this.tipo = tipo;
        this.textura = textura;
        this.modelo3D = modelo3D;
    }

    @Override
    public void renderizar(int posX, int posY) {
        System.out.println("Renderizando unidade do tipo " + tipo + " na posição (" + posX + ", " + posY + ") com textura " + textura + " e modelo 3D " + modelo3D);

    }
}
