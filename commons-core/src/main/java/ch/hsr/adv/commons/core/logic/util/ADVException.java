package ch.hsr.adv.commons.core.logic.util;

/**
 * The main exception class to be used for ADV projects.
 */
public class ADVException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs an ADVException with the given message.
     *
     * @param message the error messsage
     */
    public ADVException(String message) {
        super(message);
    }

}
