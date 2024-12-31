package CompositeDesignPattern;

// Leaf: Reprezenton skedarët
class File implements FileSystem {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
