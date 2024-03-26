package ro.dp.sub4.cts.g1087.Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypePantof {

    private static Map<EStilPantof,Pantof> listaPantofi;

    static{
        listaPantofi=new HashMap<>();
        listaPantofi.put(EStilPantof.POP,new Pantof(ETipPantof.BALERINI,EStilPantof.POP,37,"black"));
        listaPantofi.put(EStilPantof.PUNK,new Pantof(ETipPantof.BALERINI,EStilPantof.PUNK,37,"red"));
        listaPantofi.put(EStilPantof.ROCK,new Pantof(ETipPantof.BALERINI,EStilPantof.ROCK,37,"black"));

    }

    public static Pantof getPrototype(EStilPantof stilPantof) throws CloneNotSupportedException {
        if(listaPantofi.containsKey(stilPantof)){
            try {
                return listaPantofi.get(stilPantof).clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        return null;
    }


}
