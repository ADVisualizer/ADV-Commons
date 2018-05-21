package ch.hsr.adv.commons.core.access;

/**
 * Encapsulates a response from the ADVCore UI.
 */
public class ADVResponse {

    private final ProtocolCommand command;
    private final String exceptionMessage;

    public ADVResponse(ProtocolCommand command) {
        this(command, null);
    }

    public ADVResponse(ProtocolCommand command, String exceptionMessage) {
        this.command = command;
        this.exceptionMessage = exceptionMessage;
    }

    public ProtocolCommand getCommand() {
        return command;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }
}
