package ch.hsr.adv.commons.graph.logic.domain;

import ch.hsr.adv.commons.core.logic.domain.ADVRelation;

/**
 * An edge always has an end and a start vertex. It can be directed or
 * undirected.
 *
 * @param <T> type of the edge value
 */
public interface ADVEdge<T> extends ADVRelation<T> {

    /**
     * @return true if the source and target element is identical
     */
    boolean isSelfReference();
}
