package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoanCalculatorMenu implements Initializable
{
	@FXML
	MenuBar mBar;

	@FXML
	Menu fileMenu;

	@FXML
	MenuItem close;

	@FXML
	Menu helpMenu;

	@FXML
	MenuItem about;

	public void closeClick(ActionEvent event)
	{
		Platform.exit();
		System.exit(0);
	}

	public void aboutClick(ActionEvent event)
	{
		try
		{
				Stage aboutStage;
				Parent root1;
				aboutStage = new Stage();
				root1 = FXMLLoader.load(getClass().getResource("AboutPopup.fxml"));
				aboutStage.setScene(new Scene(root1));
				aboutStage.setTitle("About This");
				aboutStage.getIcons().add(new Image("/images/calcIcon.png"));
				aboutStage.initModality(Modality.APPLICATION_MODAL);
				aboutStage.showAndWait();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		assert mBar != null : "fx:id=\"mBar\" was not injected: check your FXML file 'LoanView.fxml'.";
		assert fileMenu != null : "fx:id=\"fileMenu\" was not injected: check your FXML file 'LoanView.fxml'.";
		assert helpMenu != null : "fx:id=\"helpMenu\" was not injected: check your FXML file 'LoanView.fxml'.";
		assert close != null : "fx:id=\"close\" was not injected: check your FXML file 'LoanView.fxml'.";
		assert about != null : "fx:id=\"about\" was not injected: check your FXML file 'LoanView.fxml'.";

	}

}
