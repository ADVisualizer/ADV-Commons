package ch.hsr.adv.commons.core.logic.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;

/**
 * Represents the session which holds multiple snapshots
 */
public class Session {

    private final List<Snapshot> snapshots = new ArrayList<>();
    private long sessionId;
    private String sessionName;

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public List<Snapshot> getSnapshots() {
        return snapshots;
    }

    /**
     * Returns the first Snapshot (index 0) of all snapshots if it exists.
     * Otherwise returns a new Snapshot.
     *
     * @return the first Snapshot or a new Snapshot
     */
    public Snapshot getFirstSnapshot() {
        if (snapshots.isEmpty()) {
            return new Snapshot();
        }
        return snapshots.get(0);
    }

    @Override
    public String toString() {
        String time = String.format("%tT", sessionId - TimeZone.getDefault()
                .getRawOffset() + TimeZone.getDefault().getDSTSavings());

        return time + " - " + sessionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Session session = (Session) o;
        return sessionId == session.sessionId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(sessionId);
    }

    /**
     * @param id of the snapshot
     * @return the snapshot with the specified id or a new 'dummy' if no such
     * snapshot exists.
     */
    public Snapshot getSnapshotById(long id) {
        return snapshots.stream().filter(s -> s
                .getSnapshotId() == id).findFirst().orElse(new Snapshot());
    }
}
