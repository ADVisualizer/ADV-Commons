package ch.hsr.adv.commons.core.logic.domain.styles;

/**
 * Defines the thickness of the stroke or border of an element.
 */
public enum ADVStrokeThickness {

    THIN(1.0), STANDARD(1.5), MEDIUM(2), THICK(2.5);

    private double thickness;

    ADVStrokeThickness(double thickness) {
        this.thickness = thickness;
    }

    /**
     * Returns the enum of the specified string.
     *
     * @param ticknessName string linked to the enum value
     * @return the enum
     */
    public static ADVStrokeThickness byName(String ticknessName) {
        return valueOf(ticknessName.toUpperCase());
    }

    public double getThickness() {
        return thickness;
    }
}
