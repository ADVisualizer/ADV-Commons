package ch.hsr.adv.commons.tree.logic.domain;

import ch.hsr.adv.commons.core.logic.domain.ADVRelation;
import ch.hsr.adv.commons.core.logic.domain.styles.ADVStyle;

/**
 * Represents the content of a tree edge.
 * Don't use this class in the user codebase.
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
 */
public class TreeNodeRelation implements ADVRelation<String> {

    private static final transient boolean DEFAULT_DIRECTED = false;
    private static final transient String DEFAULT_LABEL = "";

    private long sourceElementId;
    private long targetElementId;
    private String label;
    private ADVStyle style;
    private boolean directed;

    public TreeNodeRelation(long parentId, long childId, ADVStyle style) {
        directed = DEFAULT_DIRECTED;
        label = DEFAULT_LABEL;
        sourceElementId = parentId;
        targetElementId = childId;
        this.style = style;
    }

    @Override
    public long getSourceElementId() {
        return sourceElementId;
    }

    @Override
    public void setSourceElementId(long sourceElementId) {
        this.sourceElementId = sourceElementId;
    }

    @Override
    public long getTargetElementId() {
        return targetElementId;
    }

    @Override
    public void setTargetElementId(long targetElementId) {
        this.targetElementId = targetElementId;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public ADVStyle getStyle() {
        return style;
    }

    @Override
    public void setStyle(ADVStyle style) {
        this.style = style;
    }

    @Override
    public boolean isDirected() {
        return directed;
    }

    @Override
    public void setDirected(boolean directed) {
        this.directed = directed;
    }
}
