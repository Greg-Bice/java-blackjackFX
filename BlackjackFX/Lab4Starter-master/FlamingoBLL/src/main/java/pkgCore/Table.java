package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

public class Table {

	private UUID TableID;
	private HashMap<UUID, Player> hmTablePlayers = new HashMap<UUID,Player>();
	
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	
	public void AddPlayerToTable(Player p)
	{
		hmTablePlayers.put( p.getPlayerID(), p );
	}
	public void RemovePlayerFromTable(Player p)
	{
		if ( hmTablePlayers.containsKey( p.getPlayerID() ) ) {
			hmTablePlayers.remove( p.getPlayerID() );
		}
	}
	
	public Player GetPlayerFromTable(Player p)
	{
		if ( hmTablePlayers.containsKey( p.getPlayerID() ) ) { 
			return hmTablePlayers.get(  p.getPlayerID()  );
		} else {
			return null;
		}
	}
	
	public HashMap<UUID, Player> getAllPlayers() {
		return hmTablePlayers;
	}
	
	public void ClearTable()
	{
		hmTablePlayers.clear();
	}
}
