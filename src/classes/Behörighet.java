package classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Behörighet {

	private ObservableList<Personal> personal = FXCollections.observableArrayList();

	
	//GETTERS AND SETTERS
	public ObservableList<Personal> getPersonal() {
		return personal;
	}
	public void setPersonal(ObservableList<Personal> personal) {
		this.personal = personal;
	}
	
	//METODER
	public void addPersonal (Personal personal) {
		this.personal.add(personal);
	}
	public Personal findPersonal(String namn) {
		for (Personal tmp : this.personal) {
			if (tmp.getNamn().equals(namn)) {
				return tmp;
			}
		}
		return null;
	}
	public Personal removePersonal(Personal personal) {
		this.personal.remove(personal);
		System.out.println(personal.getNamn() + "'s behörighet togs bort ");
		return personal;
	}
}
