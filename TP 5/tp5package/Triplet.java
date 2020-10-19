package tp5package;

public class Triplet<T extends Comparable>{
	
	private T premier;
	private T second;
	private T troisieme;

	/**
	 * @param premier
	 * @param second
	 * @param troisieme
	 */
	public Triplet(T premier, T second, T troisieme) {
		super();		
		this.premier = premier;
		this.second = second;
		this.troisieme = troisieme;
		T min = this.premier;
		if(this.second.compareTo(min)>0)
			min = this.second;
		if(this.troisieme.compareTo(min)>0)
			min = this.troisieme;
		this.premier = min;
		// premier contient la plus petite valeur
		
		if(this.second.compareTo(this.troisieme)>0)
			min = this.second;
			this.second = this.troisieme;
			this.troisieme = min;
	}


	@Override
	public String toString() {
		return "Triplet [premier=" + premier + ", second=" + second + ", troisieme=" + troisieme + "]";
	}
	
	
	public T getPremier() {
		return premier;
	}
	public void setPremier(T premier) {
		this.premier = premier;
	}
	public T getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second = second;
	}
	public T getTroisieme() {
		return troisieme;
	}
	public void setTroisieme(T troisieme) {
		this.troisieme = troisieme;
	}
		
	
	
}
