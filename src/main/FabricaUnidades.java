package main;

import java.util.HashMap;
import java.util.Map;

public class FabricaUnidades {
    private Map<String, UnidadeFlyweight> unidades = new HashMap<>();

    public UnidadeFlyweight getUnidade(String tipo) {
        if (!unidades.containsKey(tipo)) {
            switch (tipo) {
                case "soldado":
                    unidades.put(tipo, new TipoUnidade("soldado", "textura_soldado.png", "modelo_soldado.obj"));
                    break;
                case "tanque":
                    unidades.put(tipo, new TipoUnidade("tanque", "textura_tanque.png", "modelo_tanque.obj"));
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de unidade desconhecido: " + tipo);
            }
        }
        return unidades.get(tipo);
    }
}
