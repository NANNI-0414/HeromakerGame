package Control.Observer;

public interface PlayerObserver {
	public void add(Observer observer);
	public void delete(Observer observer);
	public void notifyObservers();
}
