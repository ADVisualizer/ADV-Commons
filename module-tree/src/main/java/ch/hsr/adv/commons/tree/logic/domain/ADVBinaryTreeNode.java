package ch.hsr.adv.commons.tree.logic.domain;

/**
 * A BinaryTreeNode holds a value.
 *
 * @param <T> the value of the BinaryTreeNode
 */
public interface ADVBinaryTreeNode<T> extends ADVTreeNode<T> {

    /**
     * Returns the left child of the node
     *
     * @return left child
     */
    ADVBinaryTreeNode<T> getLeftChild();

    /**
     * Returns the right child of the node
     *
     * @return right child
     */
    ADVBinaryTreeNode<T> getRightChild();

}