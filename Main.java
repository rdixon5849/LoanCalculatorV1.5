package application;
/*
 * Monthly Loan Calculator
 * 
 * Version 1.5
 * 
 * July 2016
 * 
 * Simple Program that takes in doubles and allows for the
 * calculation of the value of these as a monthly payment
 * 
 * New to Version 1.5:
 * 
 * -Numbers output cut off to 2 decimal places
 * -Fixed size of window (it will not shrink smaller than set)
 * -Added simple file menu
 * 
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		try
		{
			AnchorPane page = (AnchorPane) FXMLLoader.load(Main.class.getResource("LoanView.fxml"));

			Scene scene = new Scene(page);
			scene.getStylesheets().add("/application/loanCalculator.css");
			primaryStage.setScene(scene);
			primaryStage.setTitle("Loan Calculator");
			primaryStage.show();
			primaryStage.getIcons().add(new Image("/images/calcIcon.png"));
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		launch(args);
	}
	
	
}
