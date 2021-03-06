package ch.hsr.adv.commons.stack.logic.domain;


import ch.hsr.adv.commons.core.logic.domain.ADVElement;
import ch.hsr.adv.commons.core.logic.domain.styles.ADVStyle;

/**
 * Represents the content of one stack element.
 * Don't use this class in the user codebase.
 * <p>
 * Remark: The class could also be package-scoped, however would have be
 * moved to the parent-package in order to by accessible by the StackBuilder.
 */
public class StackElement implements ADVElement<String> {

    private static final transient int DEFAULT_POSITION = 0;
    private long id;
    private String content;
    private ADVStyle style;

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
