package classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Personalregister {
	private ObservableList<Personal> personalLista = FXCollections.observableArrayList();
	
	
	public ObservableList<Personal> getObservablePersonalLista() {
		return personalLista;
	}
	public void setObservablePersonalLista(ObservableList<Personal> personalLista) {
		this.personalLista = personalLista;
	}
	
	//Metoder
	public void addPersonal(Personal personal) {
		this.personalLista.add(personal);
	}
	public Personal removePersonal(Personal personal) {
		this.personalLista.remove(personal);
		System.out.println(personal.getNamn() + " togs bort ur personalregistret.");
		return personal;
	}
	

}
