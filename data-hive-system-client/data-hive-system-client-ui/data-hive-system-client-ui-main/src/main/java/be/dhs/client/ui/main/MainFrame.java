package be.dhs.client.ui.main;

import static be.dhs.client.ui.main.menu.MenuBarBuilder.mainMenuBar;
import static be.dhs.client.ui.main.panel.Panels.MAINPANEL;
import static java.awt.BorderLayout.CENTER;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import be.dhs.client.api.IPresenter;
import be.dhs.client.ui.main.panel.MainContainer;
import be.dhs.client.ui.main.panel.MainPanel;
import be.dhs.client.ui.main.panel.ClientPanel;
import be.dhs.client.ui.main.panel.Panels;
/**
 * This is the main frame of the application.
 * Visual components are added using a the builder pattern.
 * Just a test.
 * @author GallifreyanCode
 * @version 0
 */
public class MainFrame extends JFrame implements ClientPanel {
	private static final long serialVersionUID = -763491454756428767L;
	private static final int DEFAULT_WIDTH = 200;
	private static final int DEFAULT_HEIGHT = 200;
	private IPresenter mainPresenter;
	/**
	 * Default constructor.
	 */
	public MainFrame(IPresenter mainPresenter){
		this.mainPresenter = mainPresenter;
		setName(getClass().getSimpleName());
		setDefaultSettings();
		loadUIComponents();		
	}
	/**
	 * Sets the size of the frame.
	 * @return MainFrame: this instance of JFrame
	 */
	public MainFrame setDimension(int width, int height){
		this.setSize(new Dimension(width, height));
		return this;
	}
	/**
	 * Sets the frame in the center of the screen.
	 * @return MainFrame: this instance of JFrame
	 */
	public MainFrame setCentered(){
		Dimension screenDimensions = Toolkit.getDefaultToolkit().getScreenSize();
		int width = this.getSize().width;
		int height = this.getSize().height;
		int x = (screenDimensions.width-width)/2;
		int y = (screenDimensions.height-height)/2;
		this.setLocation(x, y);
		return this;
	}
	/**
	 * Makes the frame visible on the screen.
	 * @return void; this will stop the builder styled adding
	 */
	public void showMainFrame(){
		this.setVisible(true);
	}
	/**
	 * Loads the default settings,
	 *  this functions as some sort of backup for when no custom preferences are enabled before drawing the frame.
	 * It can also contains predefined settings which are not overruled by custom preferences.
	 */
	@Override
	public void setDefaultSettings(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));

		this.setJMenuBar(mainMenuBar());
	}
	/**
	 * Load base UI components here.
	 * Base components are components that are always loaded.
	 */
	@Override
	public void loadUIComponents(){
		MainContainer mainContainer = new MainContainer();
		mainContainer.add(new MainPanel(mainPresenter), MAINPANEL.name());
		mainContainer.gotoHome();
		getContentPane().add(mainContainer, CENTER);
	}
}
