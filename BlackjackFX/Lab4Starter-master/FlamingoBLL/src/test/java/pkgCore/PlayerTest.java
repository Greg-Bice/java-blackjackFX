package pkgCore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PlayerTest {
	
	@Test
	public void TestTable() {
		Table table = new Table();
		
		Player p1 = new Player("Foo", 0 );
		Player p2 = new Player("Bar", 1 );
		
		table.AddPlayerToTable( p1 );
		table.AddPlayerToTable( p2 );
		
		assertEquals( table.GetPlayerFromTable( p1 ).getPlayerName(), "Foo" );
		assertEquals( table.GetPlayerFromTable( p2 ).getPlayerName(), "Bar" );
		
		table.RemovePlayerFromTable( p2 );
		
		assertNull( table.GetPlayerFromTable( p2 ) );
		
	}
	
}
