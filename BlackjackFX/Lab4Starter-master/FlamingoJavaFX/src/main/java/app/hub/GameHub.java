package app.hub;


import java.io.IOException;


import netgame.common.Hub;
import pkgCore.Action;
import pkgCore.Table;


public class GameHub extends Hub {

	private Table HubTable = new Table();


	public GameHub(int port) throws IOException {

		super(port);

	}


	@Override

	protected void messageReceived(int playerID, Object message) {

		// TODO Auto-generated method stub

		super.messageReceived(playerID, message);

		if(message instanceof Action) {

			Action act = (Action) message;

		}

	}

}
