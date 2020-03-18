package classes;

import java.util.*;

public class Behörighet {

	private Behörighetsregister behörighetsregister;
	private ArrayList<Personal> personal = new ArrayList<Personal>();

	
	//GETTERS AND SETTERS
	public ArrayList<Personal> getPersonal() {
		return personal;
	}
	public void setPersonal(ArrayList<Personal> personal) {
		this.personal = personal;
	}
	public Behörighetsregister getBehörighetsregister() {
		return behörighetsregister;
	}
	public void setBehörighetsregister(Behörighetsregister behörighetsregister) {
		this.behörighetsregister = behörighetsregister;
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
