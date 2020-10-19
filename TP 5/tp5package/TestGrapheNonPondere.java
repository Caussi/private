package tp5package;

public class TestGrapheNonPondere {
	

	public static void main(String[] args){
		
		GrapheNonPondere gn = new GrapheNonPondere();
		System.out.println("Ajout sommet A");
		gn.ajouteSommet("A"); 
		System.out.println(gn);
		System.out.println("Ajout arc (A,B)");
		gn.ajouteArc("A","B");
		System.out.println(gn);
		System.out.println("Ajout arc (B,C)");
		gn.ajouteArc("B", "C");
		System.out.println(gn);
		System.out.println("Ajout arc (A, D)");
		gn.ajouteArc("A", "D");
		System.out.println(gn);
		
		//Graphe pondéré
		/*
		GraphePondere gp = new GraphePondere();
		System.out.println("Ajout sommet(A , B, 3)");
		System.out.println(gn);
		*/

		
	}
}
