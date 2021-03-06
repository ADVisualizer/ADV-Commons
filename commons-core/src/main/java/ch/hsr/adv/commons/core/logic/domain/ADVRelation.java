package ch.hsr.adv.commons.core.logic.domain;

import ch.hsr.adv.commons.core.logic.domain.styles.ADVStyle;

/**
 * A relation represents a connection between or an order of two elements.
 *
 * @param <T> label type
 */
public interface ADVRelation<T> {

    /**
     * Gets the source of the relation. For example the starting node of an
     * edge.
     *
     * @return the source of the relation
     */
    long getSourceElementId();


    /**
     * Sets the source of the relation. For example the starting node of an
     * edge.
     *
     * @param sourceElementId id of the source
     */
    void setSourceElementId(long sourceElementId);

    /**
     * Gets the target of the relation. For example the ending node of an edge.
     *
     * @return the target of the relation
     */
    long getTargetElementId();

    /**
     * Sets the target of the relation. For example the ending node of an edge.
     *
     * @param targetElementId id of the target
     */
    void setTargetElementId(long targetElementId);

    /**
     * Sets the label for the relation. For example the weight of an edge.
     *
     * @return the label for the relation
     */
    T getLabel();

    /**
     * Sets the label for the relation. For example the weight of an edge.
     *
     * @param label descriptive label for the relation
     */
    void setLabel(T label);

    /**
     * Gets the style of the relation to visually differentiate it from other
     * relations. For example to show a change to the previous snapshot.
     *
     * @return the style of the relation
     */
    ADVStyle getStyle();

    /**
     * Sets the style of the relation to visually differentiate it from other
     * relations. For example to show a change to the previous snapshot.
     *
     * @param style for the relation
     */
    void setStyle(ADVStyle style);

    /**
     * @return whether the relation is directed. If {@code false},
     * sourceElement and targetElement can be switched without changing the
     * information of the relation.
     */
    boolean isDirected();

    /**
     * @param directed whether or not the edge is directed
     */
    void setDirected(boolean directed);
}
