package ch.hsr.adv.commons.core.logic.domain.styles;

/**
 * Defines the color of the background or border of an element.
 * <p>
 * Uses the material colors:
 * LIGHT = 200
 * NORMAL = 700
 * DARK = 900
 */
public enum ADVColor {
    STANDARD(0x000000),
    BLACK(0x000000),
    WHITE(0xFFFFFF),
    RED_LIGHT(0xEF9A9A),
    RED(0xD32F2F),
    RED_DARK(0xB71C1C),
    PURPLE_LIGHT(0xCE93D8),
    PURPLE(0x7B1FA2),
    PURPLE_DARK(0x4A148C),
    BLUE_LIGHT(0x81D4FA),
    BLUE(0x0288D1),
    BLUE_DARK(0x01579B),
    GREEN_LIGHT(0xA5D6A7),
    GREEN(0x388E3C),
    GREEN_DARK(0x1B5E20),
    YELLOW_LIGHT(0xFFF59D),
    YELLOW(0xFFFF00),
    YELLOW_DARK(0xFFD600),
    ORANGE_LIGHT(0xFFCC80),
    ORANGE(0xF57C00),
    ORANGE_DARK(0xE65100),
    BROWN_LIGHT(0xBCAAA4),
    BROWN(0x5D4037),
    BROWN_DARK(0x3E2723),
    GRAY_LIGHT(0xEEEEEE),
    GRAY(0x616161),
    GRAY_DARK(0x212121);

    private int colorValue;

    ADVColor(int colorValue) {
        this.colorValue = colorValue;
    }

    /**
     * Returns the enum of the specified string.
     *
     * @param name String representation of the enum value
     * @return the enum
     */
    public static ADVColor byName(String name) {
        return valueOf(name.toUpperCase());
    }

    public int getColorValue() {
        return colorValue;
    }
}
