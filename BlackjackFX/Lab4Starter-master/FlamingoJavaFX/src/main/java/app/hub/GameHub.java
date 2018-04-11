package app.hub;

import java.io.IOException;

import netgame.common.Hub;

public class GameHub extends Hub {

	public GameHub(int port) throws IOException {
		super(port);
	}

	@Override
	protected void messageReceived(int playerID, Object message) {
		// TODO Auto-generated method stub
		super.messageReceived(playerID, message);
	}
	
	

}
