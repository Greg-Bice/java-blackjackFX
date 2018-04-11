package app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Flamingo;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import pkgCore.GamePlay;
import pkgCore.Table;

public class BlackJackController implements Initializable {
	private Flamingo FlamingoGame;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
	public void setMainApp(Flamingo FlamingoGame)
	{
		this.FlamingoGame = FlamingoGame;
	}

	public void btnSitLeave_Click(ActionEvent event)
	{
		//TODO: Implement this.  Create a new 'Action', send the 'Sit' or 'Leave' action to the Hub.
		
	}
	public void HandleTableState(Table t) {

		//TODO: Implement this.
	}

	public void HandleGameState(GamePlay gp) {

		//		Coming Soon....!
	}

}
