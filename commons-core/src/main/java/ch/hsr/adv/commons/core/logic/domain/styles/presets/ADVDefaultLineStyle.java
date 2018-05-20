package ch.hsr.adv.commons.core.logic.domain.styles.presets;

import ch.hsr.adv.commons.core.logic.domain.styles.ADVStrokeThickness;

/**
 * The default implementation of the ADV Style sets standard values for all
 * style variables.
 */
public class ADVDefaultLineStyle extends ADVDefaultStyle {

    @Override
    public int getStrokeThickness() {
        return ADVStrokeThickness.THIN.getThickness();
    }
}

