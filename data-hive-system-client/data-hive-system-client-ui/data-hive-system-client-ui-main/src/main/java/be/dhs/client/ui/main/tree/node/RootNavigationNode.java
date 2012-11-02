package be.dhs.client.ui.main.tree.node;

import java.util.Vector;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

public class RootNavigationNode extends DefaultMutableTreeNode {

	public void insert(ArtistNavigationNode newChild, int childIndex) {
		if (!allowsChildren) {
            throw new IllegalStateException("node does not allow children");
        } else if (newChild == null) {
            throw new IllegalArgumentException("new child is null");
        } else if (isNodeAncestor(newChild)) {
            throw new IllegalArgumentException("new child is an ancestor");
        }

		ArtistNavigationNode oldParent = (ArtistNavigationNode)newChild.getParent();

            if (oldParent != null) {
                oldParent.remove(newChild);
            }
            newChild.setParent(this);
            if (children == null) {
                children = new Vector();
            }
            children.insertElementAt(newChild, childIndex);
	}
}
