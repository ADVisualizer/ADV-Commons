package ch.hsr.adv.commons.tree.logic.domain;

import ch.hsr.adv.commons.core.logic.domain.ADVElement;
import ch.hsr.adv.commons.core.logic.domain.styles.ADVStyle;

/**
 * Represents the content of a tree node
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
 */
public class TreeNodeElement implements ADVElement<String> {

    private static final transient int DEFAULT_POSITION = 0;

    private long id;
    private ADVStyle style;
    private String content;

    public TreeNodeElement(ADVTreeNode<?> node, long id) {
        if (node == null) {
            throw new IllegalArgumentException("node must not be null");
        }

        style = node.getStyle();
        content = node.getContent().toString();
        this.id = id;
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
        return DEFAULT_POSITION;
    }

    @Override
    public int getFixedPosY() {
        return DEFAULT_POSITION;
    }

    @Override
    public String getContent() {
        return content;
    }
}
