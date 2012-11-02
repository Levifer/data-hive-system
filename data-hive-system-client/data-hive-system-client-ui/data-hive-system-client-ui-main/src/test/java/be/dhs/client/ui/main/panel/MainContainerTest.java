package be.dhs.client.ui.main.panel;

import static be.dhs.client.ui.main.panel.Panels.MAINPANEL;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MainContainerTest {

	@Test
	public void testMainContainerInitialisation() {
		MainContainer mainContainer = new MainContainer();
		assertNotNull(mainContainer);
		mainContainer.setActiveCard(MAINPANEL);
		
	}
}
