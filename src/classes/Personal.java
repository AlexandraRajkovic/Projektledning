package classes;

import java.util.*;

public class Personal {
	private String personnummer;
	private String namn;
	private String telefonnummer;
	private String email;
	private String institution;
	private String kortnummer;
	private Personalregister personalregister;
	private ArrayList<Behörighet> behörighet = new ArrayList<Behörighet>();
	
	//Constructor
	public Personal(String namn, String personnummer, String telefonnummer, String email, String institution, String kortnummer) {
		this.namn = namn;
		this.personnummer = personnummer;
		this.telefonnummer = telefonnummer;
		this.email = email;
		this.institution = institution;
		this.kortnummer = kortnummer;
	}
	
	public Personal() {
	}
	
	//GETTERS AND SETTERS
	public String getPersonnummer() {
		return personnummer;
	}
	public void setPersonnummer(String personnummer) {
		this.personnummer = personnummer;
	}
	public String getNamn() {
		return namn;
	}
	public void setNamn(String namn) {
		this.namn = namn;
	}
	public String getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getKortnummer() {
		return kortnummer;
	}
	public void setKortnummer(String kortnummer) {
		this.kortnummer = kortnummer;
	}
	public Personalregister getPersonalregister() {
		return personalregister;
	}
	public void setPersonalregister(Personalregister personalregister) {
		this.personalregister = personalregister;
	}
	public ArrayList<Behörighet> getBehörighet() {
		return behörighet;
	}
	public void setBehörighet(ArrayList<Behörighet> behörighet) {
		this.behörighet = behörighet;
	}
	
	//Metoder
	public void addBehörighet(Behörighet behörighet) {
		this.behörighet.add(behörighet);
	}
	public Behörighet removeBehörighet(Behörighet behörighet) {
		this.behörighet.remove(behörighet);
		return behörighet;
	}
	

	
}
