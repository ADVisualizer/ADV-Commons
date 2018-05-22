package ch.hsr.adv.commons.core.logic.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the state of a data structure in the user's module
 * implementation. A snapshot always belongs to a session. It is sent to the
 * ADVCore UI to be displayed.
 */
public class Snapshot {

    private final long snapshotId;
    private String snapshotDescription;
    private List<ModuleGroup> moduleGroups = new ArrayList<>();

    public Snapshot() {
        this(0);
    }

    public Snapshot(long snapshotId) {
        this.snapshotId = snapshotId;
    }

    public long getSnapshotId() {
        return snapshotId;
    }

    public String getSnapshotDescription() {
        return snapshotDescription;
    }

    public void setSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
    }

    public List<ModuleGroup> getModuleGroups() {
        return moduleGroups;
    }

    public void setModuleGroups(List<ModuleGroup> moduleGroups) {
        this.moduleGroups = moduleGroups;
    }
}
