package application;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import classes.Behörighet;
import classes.Personal;
import classes.Personalregister;

public class Controller {

	private Personalregister personalReg = new Personalregister();
	private Behörighet behorighet1 = new Behörighet();
	private Behörighet behorighet2 = new Behörighet();
	private Behörighet behorighet3 = new Behörighet();
	private Behörighet behorighet4 = new Behörighet();

	@FXML 
	private TextField txfNamn;
	@FXML 
	private TextField txfPersonnummer;
	@FXML 
	private TextField txfTelefonnummer;
	@FXML 
	private TextField txfEmail;
	@FXML 
	private TextField txfInstitution;
	@FXML 
	private TextField txfKortnummer;
	@FXML 
	private TableView<Personal> tvPersonal;
	@FXML 
	private TableColumn<Personal, String> tcNamn;
	@FXML 
	private TableView<Personal> tvBehörighet1;
	@FXML 
	private TableColumn<Personal, String> tcNamnBehörighet1;
	@FXML 
	private TableView<Personal> tvBehörighet2;
	@FXML 
	private TableColumn<Personal, String> tcNamnBehörighet2;
	@FXML 
	private TableView<Personal> tvBehörighet3;
	@FXML 
	private TableColumn<Personal, String> tcNamnBehörighet3;
	@FXML 
	private TableView<Personal> tvBehörighet4;
	@FXML 
	private TableColumn<Personal, String> tcNamnBehörighet4;

	@FXML
	public void btn_laggTillPersonal(ActionEvent event) {
		String personalNamn = txfNamn.getText();
		String personalPersonnummer = txfPersonnummer.getText();
		String personalTelefonnummer = txfTelefonnummer.getText();
		String personalEmail = txfEmail.getText();
		String personalInstitution = txfInstitution.getText();
		String personalKortnummer = txfKortnummer.getText();

		Personal nyPersonal = new Personal(personalNamn, personalPersonnummer, personalTelefonnummer, personalEmail, personalInstitution, personalKortnummer);
		personalReg.addPersonal(nyPersonal);
		clearTextfields();
		
		try {
			tvPersonal.setItems(personalReg.getPersonalLista());
			tcNamn.setCellValueFactory(new PropertyValueFactory<Personal, String>("namn"));
		} catch (Exception e) {
			//...
		}
		

	}
	
	public void clearTextfields() {
		txfNamn.clear();
		txfPersonnummer.clear();
		txfTelefonnummer.clear();
		txfEmail.clear();
		txfInstitution.clear();
		txfKortnummer.clear();
	}

	@FXML
	public void btn_taBortPersonal(ActionEvent event) {
		Personal tmpPersonal = tvPersonal.getSelectionModel().getSelectedItem();
		personalReg.removePersonal(tmpPersonal);
		clearTextfields();
	}

	@FXML
	public void btn_hittaPersonal(ActionEvent event) {
		Personal tmpPersonal = tvPersonal.getSelectionModel().getSelectedItem();
		txfNamn.setText(tmpPersonal.getNamn());
		txfPersonnummer.setText(tmpPersonal.getPersonnummer());
		txfTelefonnummer.setText(tmpPersonal.getTelefonnummer());
		txfEmail.setText(tmpPersonal.getEmail());
		txfInstitution.setText(tmpPersonal.getInstitution());
		txfKortnummer.setText(tmpPersonal.getKortnummer());
	}

	@FXML
	public void btn_laggTillPersonalBehörighet1(ActionEvent event) {
		Personal tmpPersonal = tvPersonal.getSelectionModel().getSelectedItem();
		behorighet1.addPersonal(tmpPersonal);
		tvBehörighet1.setItems(behorighet1.getPersonal());
		tcNamnBehörighet1.setCellValueFactory(new PropertyValueFactory<Personal, String>("namn"));
		clearTextfields();
	}
	
	@FXML
	public void btn_taBortPersonalBehörighet1(ActionEvent event) {
		Personal tmpPersonal = tvBehörighet1.getSelectionModel().getSelectedItem();
		behorighet1.removePersonal(tmpPersonal);
	}
	
	@FXML
	public void btn_laggTillPersonalBehörighet2(ActionEvent event) {
		Personal tmpPersonal = tvPersonal.getSelectionModel().getSelectedItem();
		behorighet2.addPersonal(tmpPersonal);
		tvBehörighet2.setItems(behorighet2.getPersonal());
		tcNamnBehörighet2.setCellValueFactory(new PropertyValueFactory<Personal, String>("namn"));
		clearTextfields();
	}
	
	@FXML
	public void btn_taBortPersonalBehörighet2(ActionEvent event) {
		Personal tmpPersonal = tvBehörighet2.getSelectionModel().getSelectedItem();
		behorighet2.removePersonal(tmpPersonal);
	}
	
	@FXML
	public void btn_laggTillPersonalBehörighet3(ActionEvent event) {
		Personal tmpPersonal = tvPersonal.getSelectionModel().getSelectedItem();
		behorighet3.addPersonal(tmpPersonal);
		tvBehörighet3.setItems(behorighet3.getPersonal());
		tcNamnBehörighet3.setCellValueFactory(new PropertyValueFactory<Personal, String>("namn"));
		clearTextfields();
	}
	
	@FXML
	public void btn_taBortPersonalBehörighet3(ActionEvent event) {
		Personal tmpPersonal = tvBehörighet3.getSelectionModel().getSelectedItem();
		behorighet3.removePersonal(tmpPersonal);
	}
	
	@FXML
	public void btn_laggTillPersonalBehörighet4(ActionEvent event) {
		Personal tmpPersonal = tvPersonal.getSelectionModel().getSelectedItem();
		behorighet4.addPersonal(tmpPersonal);
		tvBehörighet4.setItems(behorighet4.getPersonal());
		tcNamnBehörighet4.setCellValueFactory(new PropertyValueFactory<Personal, String>("namn"));
		clearTextfields();
	}
	
	@FXML
	public void btn_taBortPersonalBehörighet4(ActionEvent event) {
		Personal tmpPersonal = tvBehörighet4.getSelectionModel().getSelectedItem();
		behorighet4.removePersonal(tmpPersonal);
	}
}
