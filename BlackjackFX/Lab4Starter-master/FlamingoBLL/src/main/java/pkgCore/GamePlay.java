
package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import pkgEnum.eGameType;

public abstract class GamePlay {
	
	private eGameType eGameType;
	
	private HashMap<UUID, Player> hmGamePlayers = new HashMap<UUID, Player>();
	
	public GamePlay( eGameType eGameType ) {
		
		super();
		this.eGameType = eGameType;
	}
	
	protected void AddPlayersToGame( ArrayList<Player> Players ) {
		
		for ( Player pl : Players ) {
			hmGamePlayers.put( pl.getPlayerID(), pl );
		}
	}
	
	protected void RemovePlayerFromGame( Player p ) {
		if ( hmGamePlayers.containsKey( p.getPlayerID() ) ) {
			hmGamePlayers.remove( p.getPlayerID() );
		}
	}
	
	protected Player GetPlayerInGame( Player p ) {
		if ( hmGamePlayers.containsKey( p.getPlayerID() ) ) { 
			return hmGamePlayers.get(  p.getPlayerID()  );
		} else {
			return null;
		}
	}
}
