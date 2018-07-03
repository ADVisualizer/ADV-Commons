package ch.hsr.adv.commons.graph.logic.domain;

import ch.hsr.adv.commons.core.logic.domain.ADVElement;
import ch.hsr.adv.commons.core.logic.domain.styles.ADVStyle;

/**
 * A Vertex holds a value.
 * <p>
 * This class suppresses rawtype warnings, because Gson does not support
 * generic wildcards. See
 * <a href="https://github.com/ADVisualizer/ADV-Lib/issues/31">Issue 31</a>
 * for more details.
 *
 * @param <T> the value of the vertex
 */
public interface ADVVertex<T> extends ADVElement<T> {

    /**
     * Returns the corresponding graph of this ndoe
     *
     * @return graph
     */
    @SuppressWarnings("rawtypes")
    ADVGraph getGraph();

    /**
     * Returns the number of leaving edges.
     *
     * @return count of edges that only leave this node plus all undirected
     * edges.
     */
    int getOutDegree();

    /**
     * Returns the number of entering edges.
     *
     * @return count of edges that only enter this node plus all undirected
     * edges.
     */
    int getInDegree();

    /**
     * Sets the id of a vertex
     *
     * @param id identifier
     */
    void setId(long id);

    /**
     * Sets the style of a vertex
     *
     * @param style style
     */
    void setStyle(ADVStyle style);

    /**
     * Sets the fixed X position of a vertex
     *
     * @param fixedPosX position X
     */
    void setFixedPosX(int fixedPosX);

    /**
     * Sets the fixed Y position of a vertex
     *
     * @param fixedPosY position Y
     */
    void setFixedPosY(int fixedPosY);

    /**
     * Sets the label content of a vertex
     *
     * @param content content
     */
    void setContent(T content);

}
