package ro.dp.sub4.cts.g1087.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Pantof extends APantof implements Cloneable{
//    protected ETipPantof tipPantof;
//    protected EStilPantof stilPantof;
//    protected List<String> listaMesaje;
//    protected int marimePantof;
//    protected String culoare;
     protected Pantof(ETipPantof tipPantof,EStilPantof stilPantof,int marime,String culoare) {
         this.tipPantof=tipPantof;
         this.stilPantof=stilPantof;
         this.marimePantof=marime;
         this.culoare=culoare;
         this.listaMesaje=new ArrayList<>();
         if(this.stilPantof==EStilPantof.PUNK){
             listaMesaje.add("Punk message");
         }
         if(this.stilPantof==EStilPantof.ROCK){
             listaMesaje.add("Rock message");
         }
         if(this.stilPantof==EStilPantof.POP){
             listaMesaje.add("Pop message");
         }


    }

    @Override
    protected Pantof clone() throws CloneNotSupportedException {
        Pantof pantof=(Pantof) super.clone();
        pantof.listaMesaje=new ArrayList<>(this.listaMesaje);
        return pantof;

    }

    @Override
    public void addMesaj(String mesaj) {
        if(this.listaMesaje==null){
            this.listaMesaje=new ArrayList<>();
        }
        int suma=0;
        for(String m:this.listaMesaje){
            suma+=m.length();

        }
        suma+=mesaj.length();
        if(suma<this.marimePantof){
            this.listaMesaje.add(mesaj);
        }
        else System.out.println("Pantoful nu indeplineste toate criteriile!");
        System.out.println(suma);

    }

    //calculeaza pretul folosind o formula ce utilizeaza tipPantof,
    //listaMesaje si marimePantof
    @Override
    public void calculeazaPret() {
        float pret=0;
        if(this.tipPantof==ETipPantof.STILETTO && this.marimePantof>35 &&this.listaMesaje.size()>1){
            pret+=100;
        }
        if(this.tipPantof==ETipPantof.BALERINI && this.marimePantof>35 &&this.listaMesaje.size()>1){
            pret+=70;
        }
        System.out.println("Pretul este de "+ pret);
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tipPantof=" + tipPantof +
                ", stilPantof=" + stilPantof +
                ", listaMesaje=" + listaMesaje +
                ", marimePantof=" + marimePantof +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
