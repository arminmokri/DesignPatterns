[< Back To Design Patterns](../../../)

# Composite Design Pattern
### Please support my repo with your star.

## Definition
The Composite Design Pattern is a structural pattern that allows you to compose objects into tree-like structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly. This pattern is especially useful when building structures such as UI components, file systems, or any recursive data models where single and composite elements should be handled the same way.

## Example in Real World/Nature Inspired
1. **Tree and Branches in Nature:** A tree is composed of branches, which themselves may contain sub-branches and leaves. Each element can be treated uniformly as part of the overall structure.
2. **Company Organization Chart:** An organization can be represented as a hierarchy of departments and employees. Each manager (composite) may manage both individuals (leaf nodes) and teams (composite nodes).
3. **Meal Components:** A meal can be broken down into main courses, side dishes, and individual ingredients. Each component can be treated the same way when calculating nutritional value or price.
4. **Musical Band Ensemble:** An orchestra is made up of individual musicians (leaves) and subgroups (composites like string or wind sections), all treated as part of the ensemble.

## Real Usage/System Design Problems
1. **File Systems:** File systems treat files and directories in a similar way. A directory can contain both files (leaves) and other directories (composites), and operations like size calculation or traversal apply to both.
2. **Graphical User Interfaces (GUI):** UI elements such as panels, buttons, and labels are often organized into tree structures. Panels can contain other panels or widgets, and all can respond to the same event handlers.
3. **Document Editors:** A document can contain elements like paragraphs, images, and tables, which can themselves contain other elements — all treated uniformly for rendering or editing.

## Important Points of Implementation
- **Component Interface:** Define a common interface for all objects (leaf and composite) to ensure uniform treatment by client code.
- **Recursive Composition:** Composite objects hold a collection of components and implement the same interface as leaf objects, enabling recursive behavior (e.g., calling operation() on a tree).
- **Uniform Access:** Clients don’t need to distinguish between simple and complex elements, improving flexibility and simplicity.
- **Optional Parent Reference:** Composites can optionally store a reference to their parent or context, useful for traversing or modifying the tree.

<p align="center">
  <a href="../../structural/bridge">⬅️ <strong>Bridge</strong></a>
  🔸
  <a href="../../structural/decorator"><strong>Decorator</strong> ➡️</a>
</p>

[< Back To Design Patterns](../../../)
