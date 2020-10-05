package tp5package;

import java.util.TreeSet;

public class ObjetOrdonnes {

	public static void main(String[] args) {
		TreeSet<Integer> lesEntiers = new TreeSet<>();
		TreeSet<String> lesChaines = new TreeSet<>();
		
		for(int i=0; i<10; i++) {
			int tirage = (int)(100*Math.random());
			lesEntiers.add(tirage);
		}
		System.out.println("Contenu de lesEntiers :");
		System.out.println(lesEntiers.toString());
		
		lesChaines.add("Bonjour");
		lesChaines.add("Hello");
		lesChaines.add("Allo");
		lesChaines.add("Olà");
		lesChaines.add("zdravo");
		lesChaines.add("Ciao");
		lesChaines.add("Yassou");
		
		System.out.println("Contenu de lesChaines :");
		System.out.println(lesChaines.toString());	
		
		/*
		TreeSet<BankAccount> lesComptes = new TreeSet<>();
		lesComptes.add(new BankAccount(100));
		lesComptes.add(new BankAccount());
		lesComptes.add(new BankAccount(50)));
		lesComptes.add(new BankAccount(300));
		lesComptes.add(new BankAccount(200));
		
		System.out.println("Contenu de lesComptes :");
		System.out.println(lesComptes.toString());	

		*/

	}

}
