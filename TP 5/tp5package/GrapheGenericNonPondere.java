package tp5package;	

	import java.util.ArrayList;
	import java.util.HashMap;

public class GrapheGenericNonPondere<T> {

		
		private HashMap<T, ArrayList<T>> graphe; 

		public GrapheGenericNonPondere() {
			this.setGraphe(new HashMap<T, ArrayList<T>>());
			
		}

		public HashMap<T, ArrayList<T>> getGraphe() {
			return graphe;
		}

		public void setGraphe(HashMap<T, ArrayList<T>> hashMap) {
			this.graphe = hashMap;
		}
		
		public void ajouteSommet(T destination) {
			if(!containsSommet(destination)) {
				graphe.put(destination, new ArrayList<T>());
			}
		}

		public boolean containsSommet(T destination) {
			return this.graphe.containsKey(destination);
		}
		
		public void ajouteArc(T origine, T destination) {
			// exemple : vérifier que A appartient au graphe, sinon ajouter A etc
			this.ajouteSommet(origine);
			this.ajouteSommet(destination);
			if(!this.graphe.get(origine).contains(destination)) {
				this.graphe.get(origine).add(destination);
			}

		}
		
		@Override
		public String toString() {
			String graphString = "";
			for(T sommet : this.graphe.keySet()) {
				graphString=graphString.concat("{"+sommet+",{");
				ArrayList<T> lesDestinations = this.graphe.get(sommet);
				
				
				for(T destination : lesDestinations ) {
					graphString=graphString.concat(destination+",");
				}
				graphString=graphString.concat("}} \n");
			}
			return graphString;
		}
		
	}

