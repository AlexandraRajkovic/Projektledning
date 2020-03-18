package classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Personalregister {
	private ObservableList<Personal> personalLista = FXCollections.observableArrayList();
	
	
	public ObservableList<Personal> getPersonalLista() {
		return personalLista;
	}
	public void setPersonalLista(ObservableList<Personal> personalLista) {
		this.personalLista = personalLista;
	}
	
	//Metoder
	public void addPersonal(Personal personal) {
		personalLista.add(personal);
	}
	public void removePersonal(Personal personal) {
		personalLista.remove(personal);
		System.out.println(personal.getNamn() + " togs bort ur personalregistret.");
	}
	

}
