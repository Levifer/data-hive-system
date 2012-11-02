package be.dhs.client.api;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTextField;
/**
 * Controller Fa�ade for UI.
 * It elimintes crazy dependencies and restricts UI interactions.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 */
public interface IPresenter {
	ActionListener actionAddArtist(JTextField txt);
	int getArtistCount();
}
