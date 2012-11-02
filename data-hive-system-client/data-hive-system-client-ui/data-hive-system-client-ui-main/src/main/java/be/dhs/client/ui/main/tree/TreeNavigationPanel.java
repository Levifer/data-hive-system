package be.dhs.client.ui.main.tree;

import static be.dhs.client.ui.main.tree.TreeNavigationModel.aTreeModel;

import java.util.List;

import javax.swing.JTree;
import javax.swing.tree.TreeModel;

import be.dhs.flavour.music.Artist;

public class TreeNavigationPanel extends JTree {

	private TreeModel treeModel;

	public TreeNavigationPanel() {
		setRootVisible(false);
	}

	public void loadCreators(List<Artist> creators) {
		treeModel = aTreeModel().withArtists(creators).build();
		setModel(treeModel);
	}

}
