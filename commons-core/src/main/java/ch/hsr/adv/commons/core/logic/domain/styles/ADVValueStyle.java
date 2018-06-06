package ch.hsr.adv.commons.core.logic.domain.styles;


import ch.hsr.adv.commons.core.logic.util.ADVStyleException;

/**
 * ADVStyle implementation that uses 'low level' values.
 */
public class ADVValueStyle implements ADVStyle {

    private int fillColor;
    private int strokeColor;
    private ADVStrokeStyle strokeStyle;
    private double strokeThickness;

    /**
     * Default constructor which uses default values
     */
    public ADVValueStyle() {
        this(ADVColor.BLACK.getColorValue(), ADVStrokeStyle.NONE,
                ADVStrokeThickness.STANDARD.getThickness());
    }

    /**
     * Convenience constructor which uses the default fill color
     *
     * @param strokeColor     stroke color
     * @param strokeStyle     stroke style
     * @param strokeThickness stroke thickness
     */
    public ADVValueStyle(int strokeColor,
                         ADVStrokeStyle strokeStyle,
                         double strokeThickness) {

        this(ADVColor.BLACK.getColorValue(), strokeColor, strokeStyle,
                strokeThickness);
    }

    public ADVValueStyle(int fillColor, int strokeColor,
                         ADVStrokeStyle strokeStyle,
                         double strokeThickness) {

        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeThickness = strokeThickness;
        this.strokeStyle = strokeStyle;
    }

    @Override
    public int getFillColor() {
        return fillColor;
    }

    /**
     * Sets the fill color if it is a valid color. Valid values are between
     * 0x000000 and 0xffffff
     *
     * @param fillColor hex color value to be set
     * @throws ADVStyleException if color is invalid
     */
    public void setFillColor(int fillColor) throws ADVStyleException {
        if (isValidColorValue(fillColor)) {
            this.fillColor = fillColor;
        } else {
            throw new ADVStyleException("Invalid color value. Valid values "
                    + "are between 0x000000 and 0xffffff");
        }
    }

    @Override
    public int getStrokeColor() {
        return strokeColor;
    }

    /**
     * Sets the stroke color if it is a valid color. Valid values are between
     * 0x000000 and 0xffffff
     *
     * @param strokeColor hex color value to be set
     * @throws ADVStyleException if color is invalid
     */
    public void setStrokeColor(int strokeColor) throws ADVStyleException {
        if (isValidColorValue(strokeColor)) {
            this.strokeColor = strokeColor;
        } else {
            throw new ADVStyleException("Invalid color value. Valid values "
                    + "are between 0x000000 and 0xffffff");
        }
    }

    @Override
    public String getStrokeStyle() {
        return strokeStyle.getStyle();
    }

    public void setStrokeStyle(ADVStrokeStyle strokeStyle) {
        this.strokeStyle = strokeStyle;
    }

    @Override
    public double getStrokeThickness() {
        return strokeThickness;
    }

    /**
     * Sets the stroke thickness, if it is a valid value.
     *
     * @param strokeThickness to be set
     * @throws ADVStyleException if stroke thickness &lt; 0
     */
    public void setStrokeThickness(int strokeThickness)
            throws ADVStyleException {
        if (strokeThickness >= 0) {
            this.strokeThickness = strokeThickness;
        } else {
            throw new ADVStyleException("Invalid stroke thickness. Please use"
                    + " a value >= 0");
        }

    }

    private boolean isValidColorValue(int colorValue) {
        return colorValue >= 0 && colorValue <= 0xffffff;
    }
}
