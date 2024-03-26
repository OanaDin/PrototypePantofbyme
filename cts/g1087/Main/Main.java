package ro.dp.sub4.cts.g1087.Main;

import ro.dp.sub4.cts.g1087.Prototype.EStilPantof;
import ro.dp.sub4.cts.g1087.Prototype.ETipPantof;
import ro.dp.sub4.cts.g1087.Prototype.Pantof;
import ro.dp.sub4.cts.g1087.Prototype.PrototypePantof;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Pantof pantof1= PrototypePantof.getPrototype(EStilPantof.POP);
        Pantof p2=PrototypePantof.getPrototype(EStilPantof.POP);

        pantof1.addMesaj("0088");
        pantof1.calculeazaPret();

        System.out.println(pantof1);
        System.out.println(p2);

    }
}
