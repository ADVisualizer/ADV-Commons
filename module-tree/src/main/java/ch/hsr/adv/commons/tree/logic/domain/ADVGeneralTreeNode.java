package ch.hsr.adv.commons.tree.logic.domain;

import java.util.List;

/**
 * A GeneralTreeNode holds a value inside a general tree implementation
 * @param <T> Node value
 */
public interface ADVGeneralTreeNode<T> extends ADVTreeNode<T> {
    /**
     * Returns the children of the node
     * if the node has no children the return value should be an empty list
     * @return child nodes
     */
    List<T> getChildren();
}
