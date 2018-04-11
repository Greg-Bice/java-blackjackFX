package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
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
		//TODO: Implement this method
	}
	public void RemovePlayerFromTable(Player p)
	{
		//TODO: Implement this method		
	}
	
	public Player GetPlayerFromTable(Player p)
	{
		//TODO: Implement this method	
		return null;
	}
	public void ClearTable()
	{
		//TODO: Implement this method	
	}
}
