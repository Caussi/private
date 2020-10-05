package tp5package;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListSertTreeSet {
	
	public static void mai(String[] args) {
	List<Integer> list = new ArrayList<>();
	Set<Integer> set = new HashSet<>();
	Set<Integer> treeSet = new TreeSet<>();
	
	for(int i=0; i<10; i++) {
		int tirage = (int)(100*Math.random());
		list.add(tirage);
		set.add(tirage);
		treeSet.add(tirage);
	}

	System.out.println("Contenu de List :");
	System.out.println(list.toString());
	System.out.println("Contenu de HashSet :");
	System.out.println(set.toString());
	System.out.println("Contenu de TreeSet :");
	System.out.println(treeSet.toString());

	}
	
	

}
