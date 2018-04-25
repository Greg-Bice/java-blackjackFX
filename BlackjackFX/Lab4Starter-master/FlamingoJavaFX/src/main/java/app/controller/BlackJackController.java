package app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Flamingo;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import pkgCore.Action;
import pkgCore.GamePlay;
import pkgCore.Player;
import pkgCore.Table;
import pkgEnum.eAction;

public class BlackJackController implements Initializable {
	private Flamingo FlamingoGame;
	
	private Label lblBottom;
	private Label lblTop;
	private Button btnBottom;
	private Button btnTop;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
	public void setMainApp(Flamingo FlamingoGame)
	{
		this.FlamingoGame = FlamingoGame;
	}

	public void btnSitLeave_Click(ActionEvent event)
	{
		
		Button btn =  (Button) event.getSource();
		
		Action act = new Action();
		act.setAction( btn.getText().equals( "Sit" ) ? eAction.Sit : eAction.Leave );
		
		Player pl = FlamingoGame.getAppPlayer();
		
		// Change to Enums for coding with context for next lab.
		if ( btn.getId() == "btnTop" ) {
			pl.setiPlayerPosition( 2 );
		} else if ( btn.getId() == "btnBottom" ) {
			pl.setiPlayerPosition( 0 );
		}
		
		FlamingoGame.SendMessageToClient( act );
		
	}
	public void HandleTableState(Table t) {

		for ( Player pl : t.getAllPlayers().values() ) {
			
			switch( pl.getiPlayerPosition() ) {
				
				case 0:
					
					if ( pl.getPlayerID() == FlamingoGame.getAppPlayer().getPlayerID() ) {
						btnBottom.setVisible( true );
						btnBottom.setText( "Leave" );
						btnTop.setVisible( false );
					} else {
						btnBottom.setVisible( false );
						btnBottom.setText( "Sit" );
						btnTop.setVisible( true );
					}
					
					lblBottom.setText( pl.getPlayerName() );
					
					break;
					
				case 2:
					if ( pl.getPlayerID() == FlamingoGame.getAppPlayer().getPlayerID() ) {
						btnTop.setVisible( true  );
						btnTop.setText( "Leave" );
						btnBottom.setVisible( false );
					} else {
						btnTop.setVisible(  false  );
						btnTop.setText(  "Sit" );
						btnBottom.setVisible(  true );
					}
					
					lblTop.setText( pl.getPlayerName() );
					
					break;
					
				default:
					btnTop.setVisible( true );
					btnBottom.setVisible( true );
					btnTop.setText( "Sit" );
					btnBottom.setText( "Sit" );
					lblTop.setText( "Waiting for player..." );
					lblBottom.setText(  "Waiting for player..." );
					break;
			}
			
		}
	}

	public void HandleGameState(GamePlay gp) {

		//		Coming Soon....!
	}

}
