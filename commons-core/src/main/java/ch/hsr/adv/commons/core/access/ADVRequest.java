package ch.hsr.adv.commons.core.access;


/**
 * Encapsulates a request from the ADV Lib.
 */
public class ADVRequest {

    private final ProtocolCommand command;
    private final String json;

    public ADVRequest(ProtocolCommand command) {
        this(command, null);
    }

    public ADVRequest(ProtocolCommand command, String json) {
        this.command = command;
        this.json = json;
    }

    public String getJson() {
        return this.json;
    }

    public ProtocolCommand getCommand() {
        return command;
    }
}
