package ch.hsr.adv.commons.graph.logic.domain;

import ch.hsr.adv.commons.core.logic.domain.ADVElement;
import ch.hsr.adv.commons.core.logic.domain.styles.ADVStyle;

/**
 * Represents the content of a graph vertex.
 * Dont' use this class in the user codebase.
 * <p>
 * This name adapter is used, so the user can freely choose the class field
 * names.
 * It is important that the field names match. Otherwise the UI would not
 * recognise the fields, as they can be named totally arbitrarily.
 * This is due to the fact, that Gson uses field serialization
 * instead of getter serialization.
 * <p>
 * There is an open pull-request available, which should make this class
 * superfluous.
 * <p>
 * https://github.com/google/gson/pull/1094
 * <p>
 * This class suppresses rawtype warnings, because Gson does not support
 * generic wildcards. See
 * <a href="https://github.com/ADVisualizer/ADV-Lib/issues/31">Issue 31</a>
 * for more details.
 */
public class GraphElement implements ADVElement<String> {

    private final long id;
    private final ADVStyle style;
    private final int fixedPosX;
    private final int fixedPosY;
    private String content;

    @SuppressWarnings("rawtypes")
    public GraphElement(ADVVertex vertex) {
        this.id = vertex.getId();
        if (vertex.getContent() != null) {
            this.content = vertex.getContent().toString();
        }
        this.style = vertex.getStyle();
        this.fixedPosX = vertex.getFixedPosX();
        this.fixedPosY = vertex.getFixedPosY();
    }


    @Override
    public long getId() {
        return id;
    }

    @Override
    public ADVStyle getStyle() {
        return style;
    }

    @Override
    public int getFixedPosX() {
        return fixedPosX;
    }

    @Override
    public int getFixedPosY() {
        return fixedPosY;
    }

    @Override
    public String getContent() {
        return content;
    }


}
