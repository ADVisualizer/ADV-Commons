package ch.hsr.adv.commons.core.logic.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A module group wraps all module specific elements and allows us to address
 * multiple modules in a snapshot.
 * <p>
 * This class suppresses rawtype warnings, because Gson does not support
 * generic wildcards. See
 * <a href="https://github.com/ADVisualizer/ADV-Lib/issues/31">Issue 31</a>
 * for more details.
 */
@SuppressWarnings("rawtypes")
public class ModuleGroup {

    private final String moduleName;
    private final List<ADVElement> elements = new ArrayList<>();
    private final List<ADVRelation> relations = new ArrayList<>();
    private final List<String> flags = new ArrayList<>();
    private final Map<String, String> metaData = new HashMap<>();
    private final ModulePosition position;

    public ModuleGroup(String moduleName) {
        this(moduleName, ModulePosition.DEFAULT);
    }

    public ModuleGroup(String moduleName, ModulePosition position) {
        this.moduleName = moduleName;
        this.position = position;
    }

    public String getModuleName() {
        return moduleName;
    }

    /**
     * Adds a element to the snapshot
     *
     * @param element element to add
     */
    public void addElement(ADVElement<?> element) {
        elements.add(element);
    }

    /**
     * Adds a relation to the snapshot
     *
     * @param relation relation to add
     */
    public void addRelation(ADVRelation<?> relation) {
        relations.add(relation);
    }

    public List<ADVElement> getElements() {
        return elements;
    }

    public List<ADVRelation> getRelations() {
        return relations;
    }

    public List<String> getFlags() {
        return flags;
    }

    public Map<String, String> getMetaData() {
        return metaData;
    }

    public ModulePosition getPosition() {
        return position;
    }
}
