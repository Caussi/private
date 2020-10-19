package tp5package;
//Peu importe les noms des types pour les génériques
public class TripletH<S, T, U>{
	
	private S premier;
	private T second;
	private U troisieme;
	
	/**
	 * @param premier
	 * @param second
	 * @param troisieme
	 */
	public TripletH(S premier, T second, U troisieme) {
		super();
		this.premier = premier;
		this.second = second;
		this.troisieme = troisieme;
	}

	@Override
	public String toString() {
		return "TripletH [premier=" + premier + ", second=" + second + ", troisieme=" + troisieme + "]";
	}}
