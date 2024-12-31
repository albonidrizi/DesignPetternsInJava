package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

// Composite: Reprezenton dosjet që mund të përmbajnë skedarë ose dosje të tjera
class Folder implements FileSystem {
    private final String name;
    private final List<FileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem) {
        children.add(fileSystem);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystem child : children) {
            child.showDetails();
        }
    }
}
