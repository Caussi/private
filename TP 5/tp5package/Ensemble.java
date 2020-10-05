package tp5package;

import java.util.ArrayList;

public class Ensemble {
	
	private ArrayList<Integer> liste;
	
	public Ensemble() {
		this.liste = new Arraylist<>();
		
	}
	
	public Ensemble(Arraylist<Integer> liste) {
		this.liste = new Arraylist<>(liste);
	}
	
	public void ajoute(int e) {
		this.liste.add(e);
	}
	
	public int taille() {
		return this.liste.size();
	}
	
}

