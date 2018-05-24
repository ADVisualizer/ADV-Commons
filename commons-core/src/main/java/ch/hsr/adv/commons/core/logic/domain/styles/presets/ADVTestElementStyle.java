package ch.hsr.adv.commons.core.logic.domain.styles.presets;


import ch.hsr.adv.commons.core.logic.domain.styles.ADVColor;
import ch.hsr.adv.commons.core.logic.domain.styles.ADVStrokeStyle;
import ch.hsr.adv.commons.core.logic.domain.styles.ADVStrokeThickness;
import ch.hsr.adv.commons.core.logic.domain.styles.ADVStyle;

/**
 * The default style for ADV elements
 * <p>
 * The style is overwritten by it subclasses.
 */
public class ADVTestElementStyle implements ADVStyle {

    protected int fillColor = ADVColor.STANDARD.getColorValue();
    protected int strokeColor = ADVColor.STANDARD.getColorValue();
    protected double strokeThickness = ADVStrokeThickness.STANDARD
            .getThickness();
    protected String strokeStyle = ADVStrokeStyle.SOLID.getStyle();

    @Override
    public int getFillColor() {
        return fillColor;
    }

    @Override
    public int getStrokeColor() {
        return strokeColor;
    }

    @Override
    public String getStrokeStyle() {
        return strokeStyle;
    }

    @Override
    public double getStrokeThickness() {
        return strokeThickness;
    }

}
