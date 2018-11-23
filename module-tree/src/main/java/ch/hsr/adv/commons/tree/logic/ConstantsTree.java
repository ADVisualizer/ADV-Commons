package ch.hsr.adv.commons.tree.logic;

/**
 * Tree module-specific constants
 */
public class ConstantsTree {

    /**
     * Binary tree Module name
     */
    public static final String MODULE_NAME_BINARY_TREE = "tree-binary";

    /**
     * General tree Module name
     */
    public static final String MODULE_NAME_GENERAL_TREE = "tree-general";

    /**
     * Binary array tree module name
     */
    public static final String MODULE_NAME_BINARY_ARRAY_TREE =
            "tree-binary-array";

    /**
     * Collection tree Module name
     */
    public static final String MODULE_NAME_COLLECTION_TREE = "tree-collection";

    /**
     * Flag for binary-trees to show array-indices
     */
    public static final String SHOW_ARRAY_INDICES = "show-array-indices";

    /**
     * this key is used for the binary tree modules when the client wants fixed
     * nodes to set the max left height of a tree in the moduleGroup metadata
     * it is needed because of the special circumstance of a left hanging tree
     */
    public static final String MAX_TREE_HEIGHT_LEFT = "max-left-tree-height";

    /**
     * this key is used for the binary tree modules when the client wants fixed
     * nodes to set the max right height of a tree in the moduleGroup metadata
     * it is needed because of the special circumstance of a right hanging tree
     */
    public static final String MAX_TREE_HEIGHT_RIGHT = "max-right-tree-height";
}
