package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.net.URL;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import classes.Behörighet;
import classes.Behörighetsregister;
import classes.Personal;
import classes.Personalregister;

public class Controller {

	private Behörighetsregister behörighetsReg = new Behörighetsregister();
	private Personalregister personalReg = new Personalregister();
	private Personal personal = null;	
	private Behörighet behörighet = null;

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
		txfNamn.clear();
		txfPersonnummer.clear();
		txfTelefonnummer.clear();
		txfEmail.clear();
		txfInstitution.clear();
		txfKortnummer.clear();
		tvPersonal.setItems(personalReg.getObservablePersonalLista());
	}
	
	@FXML
	public void btn_taBortPersonal(ActionEvent event) {
		Personal tmpPersonal = tvPersonal.getSelectionModel().getSelectedItem();
		personalReg.removePersonal(tmpPersonal);
		
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
	
}
