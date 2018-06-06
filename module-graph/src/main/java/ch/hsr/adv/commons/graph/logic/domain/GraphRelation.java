package ch.hsr.adv.commons.graph.logic.domain;

import ch.hsr.adv.commons.core.logic.domain.ADVRelation;
import ch.hsr.adv.commons.core.logic.domain.styles.ADVStyle;

/**
 * Represents the content of a graph edge.
 * Don't use this class in the user codebase.
 * <p>
 * This name adapter is used, so the user can freely choose the class field
 * names.
 * It is important that the field names match. Otherwise the UI would not
 * recognise the fields, as they can be named totally arbitrarily.
 * This is due to the fact, that Guice uses field serialization
 * instead of getter serialization.
 * <p>
 * There is an open pull-request available, which should make this class
 * superfluous.
 * <p>
 * https://github.com/google/gson/pull/1094
 */
public class GraphRelation implements ADVRelation<String> {

    private long sourceElementId;
    private long targetElementId;
    private boolean isDirected;
    private String label;
    private ADVStyle style;

    public GraphRelation(ADVEdge edge) {
        this.sourceElementId = edge.getSourceElementId();
        this.targetElementId = edge.getTargetElementId();
        this.isDirected = edge.isDirected();
        if (edge.getLabel() != null) {
            this.label = edge.getLabel().toString();
        }
        this.style = edge.getStyle();
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
        throw new UnsupportedOperationException();
    }

    @Override
    public ADVStyle getStyle() {
        return style;
    }

    @Override
    public void setStyle(ADVStyle style) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isDirected() {
        return isDirected;
    }

    @Override
    public void setDirected(boolean directed) {
        throw new UnsupportedOperationException();
    }
}
