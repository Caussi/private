package tp5package;

import java.util.ArrayList;

public class Ensemble {
	
	private ArrayList<Integer> liste;
	
	public Ensemble() {
		this.liste = new ArrayList<>();
		
	}
	
	public Ensemble(ArrayList<Integer> liste) {
		this.liste = new ArrayList<>(liste);
	}
	
	public void ajoute(int e) {
		if(!this.liste.contains(e))
			this.liste.add(e);
	}
	
	public int taille() {
		return this.liste.size();
	}
	
	public int getElement(int i) {
		/*
		for (int i=0 ; i < taille() ; i++) {
		    if (Ensemble(ArrayList<i>) == x) 
			return i;
		}
		return -1;
	    }
		*/
		return this.liste.get(i);
	}
	
	@Override
	public String toString() {
		return "Ensemble :"+ this.liste.toString();
		
	}
	
	public Ensemble union(Ensemble e) {
		Ensemble union = new Ensemble(this.liste);
	for(int i = 0; i<e.taille();i++) {
		union.ajoute(e.getElement(i));
	}
	return union;
	}
	
	public Ensemble intersection(Ensemble e) {
		Ensemble intersection = new Ensemble();
		for(int i=0; i<this.taille();i++) {
			if(e.contains(this.getElement(i))) {
				intersection.ajoute(this.getElement(i));
			}	
		}
		return intersection;	
	}
	
	public boolean contains (int element) {
		return this.liste.contains(element);
	}

	
}
		
	
	
