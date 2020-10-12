package tp5package;

import java.util.ArrayList;
import java.util.HashMap;

public class GrapheNonPondere {
	
	private HashMap<String,ArrayList<String>> graphe; 

	public GrapheNonPondere() {
		this.setGraphe(new HashMap<String, ArrayList<String>>());
		
	}

	public HashMap<String,ArrayList<String>> getGraphe() {
		return graphe;
	}

	public void setGraphe(HashMap<String,ArrayList<String>> graphe) {
		this.graphe = graphe;
	}
	
	public void ajouteSommet(String sommet) {
		if(!containsSommet(sommet)) {
			graphe.put(sommet, new ArrayList<String>());
		}
	}

	public boolean containsSommet(String sommet) {
		return this.graphe.containsKey(sommet);
	}
	
	public void ajouteArc(String origine, String destination) {
		// exemple : vérifier que A appartient au graphe, sinon ajouter A etc
		this.ajouteSommet(origine);
		this.ajouteSommet(destination);
		if(!this.graphe.get(origine).contains(destination))
			this.graphe.get(origine).add(destination);	
	}
	
	@Override
	public String toString() {
		String graphString = "";
		for(String sommet : this.graphe.keySet()) {
			graphString=graphString.concat("{"+sommet+",{");
			ArrayList<String> lesDestinations = this.graphe.get(sommet);
			for(String destination : lesDestinations ) {
				graphString=graphString.concat(destination+",");
			}
			graphString=graphString.concat("}}\n");
		}
		return graphString;
	}
	
		
	
	
	
}