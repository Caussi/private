package blog;

public interface Publishable {
	
	public default String getPublicationDate() {
		Object date = null;
		return String.format("%d", date);
	}
	
	public default Object getAuthor() {
	String format = null;
	Object args = null;
	return String.format(format, args);
		
	}
	
}

