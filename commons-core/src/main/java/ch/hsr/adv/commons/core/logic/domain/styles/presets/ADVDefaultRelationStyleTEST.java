package ch.hsr.adv.commons.core.logic.domain.styles.presets;

import ch.hsr.adv.commons.core.logic.domain.styles.ADVStrokeThickness;

/**
 * Default style for relations
 */
public class ADVDefaultRelationStyleTEST extends ADVDefaultElementStyle {

    public ADVDefaultRelationStyleTEST() {
        // overwrite fields explicitly instead of getter,
        // because only the fields get serialized
        strokeThickness = ADVStrokeThickness.THIN.getThickness();
    }

}

