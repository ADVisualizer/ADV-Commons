package ch.hsr.adv.commons.tree.logic.domain;

import ch.hsr.adv.commons.core.logic.domain.styles.ADVStyle;

/**
 * A TreeNode holds a value.
 *
 * @param <T> the value of the TreeNode
 */
public interface ADVTreeNode<T> {

    /**
     * Returns the style for to the element
     *
     * @return style
     */
    ADVStyle getStyle();

    /**
     * Returns the content of the element
     *
     * @return content object
     */
    T getContent();
}
