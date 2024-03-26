package ro.dp.sub4.cts.g1087.Prototype;

import java.util.List;

public abstract class APantof {
	protected ETipPantof tipPantof;
	protected EStilPantof stilPantof;
	protected List<String> listaMesaje;
	protected int marimePantof;
	protected String culoare;
	
	//adauga un nou mesaj text care o sa fie inscriptionat pe pantof
	public abstract void addMesaj(String mesaj);
	
	//calculeaza pretul folosind o formula ce utilizeaza tipPantof, 
	//listaMesaje si marimePantof
	public abstract void calculeazaPret();
}
