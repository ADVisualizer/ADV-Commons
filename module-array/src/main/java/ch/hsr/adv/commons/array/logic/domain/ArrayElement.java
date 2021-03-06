package ch.hsr.adv.commons.array.logic.domain;

import ch.hsr.adv.commons.core.logic.domain.ADVElement;
import ch.hsr.adv.commons.core.logic.domain.styles.ADVStyle;

/**
 * Represents the content of one array index.
 * Don't use this class in the user codebase.
 */
public class ArrayElement implements ADVElement<String> {

    private static final transient int DEFAULT_POSITION = 0;
    private long id;
    private ADVStyle style;
    private String content;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public ADVStyle getStyle() {
        return style;
    }

    public void setStyle(ADVStyle style) {
        this.style = style;
    }

    /**
     * Fixed positioning of array elements is not supported, because it would
     * be nonsensical.
     *
     * @return the default fixed position
     */
    @Override
    public int getFixedPosX() {
        return DEFAULT_POSITION;
    }

    /**
     * Fixed positioning of array elements is not supported, because it would
     * be nonsensical.
     *
     * @return the default fixed position
     */
    @Override
    public int getFixedPosY() {
        return DEFAULT_POSITION;
    }

    @Override
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
