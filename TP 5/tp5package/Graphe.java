package tp5package;

import java.util.HashMap;

	
public class Graphe {


	private HashMap<String,HashMap<String, Integer>> graphe; 

	public Graphe() {
		this.setGraphe(new HashMap<String, HashMap<String, Integer>>());
		
	}

	public HashMap<String,HashMap<String, Integer>> getGraphe() {
		return graphe;
	}

	public void setGraphe(HashMap<String,HashMap<String,Integer>> hashMap) {
		this.graphe = hashMap;
	}
	
	public void ajouteSommet(String sommet) {
		if(!containsSommet(sommet)) {
			graphe.put(sommet, new HashMap<String, Integer>());
		}
	}

	public boolean containsSommet(String sommet) {
		return this.graphe.containsKey(sommet);
	}
	
	public void ajouteArc(String origine, String destination, int poids) {
		// exemple : vérifier que A appartient au graphe, sinon ajouter A etc
		this.ajouteSommet(origine);
		this.ajouteSommet(destination);
		if(!this.graphe.get(origine).containsValue(destination))
			this.graphe.get(origine).put(destination, poids);	
	}
	
	@Override
	public String toString() {
		String graphString = "";
		for(String sommet : this.graphe.keySet()) {
			graphString=graphString.concat("{"+sommet+",{");
			
			HashMap<String, Integer> lesDestinations = this.graphe.get(sommet);
			
			for(String destination : lesDestinations.keySet()) {
				graphString=graphString.concat("("+destination+","+lesDestinations.get(destination)+"),");
			}
			graphString=graphString.concat("}}\n");
		}
		return graphString;
	}
	
	
	
}
	