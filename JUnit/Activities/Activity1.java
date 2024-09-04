package Demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Activity1 {
	
	static ArrayList<String> list;
	
	@BeforeEach
	 void setUp() throws Exception {
		list = new ArrayList<String>();
		list.add("alpha");
		list.add("beta");
	}
	
	@Test
	
	public void insertTest() {
		assertEquals(2, list.size(), "Wrong size");
		list.add("chiku");
		assertEquals(3, list.size(), "Wrong size");
		
		assertEquals("alpha", list.get(0), "Wrong value");
		assertEquals("beta", list.get(1), "Wrong value");
		assertEquals("chiku", list.get(2), "Wrong size");
	}
	
	@Test
	public void replaceTest() {
		
		assertEquals(2, list.size(), "Wrong size");
		list.add("champ");
		assertEquals(3, list.size(), "Wrong size");
		
		list.set(1, "chars");
	}
}
