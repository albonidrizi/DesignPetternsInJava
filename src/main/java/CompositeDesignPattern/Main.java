package CompositeDesignPattern;

/**
 *   @author Albon Idrizi https://www.linkedin.com/in/albonidrizi/
 *
 * @Composite Pattern është një Structural Design Pattern që përdoret për të përfaqësuar struktura hierarkike ku një
 * objekt individual dhe një grup objektesh trajtohen në mënyrë uniforme.
 * Struktura e Composite Pattern
 * @1. Component: Një ndërfaqe që përcakton sjelljen e përbashkët për të gjithë elementët në strukturë.
 * @2. Leaf: Një element bazë pa fëmijë (p.sh., skedar individual).
 * @3. Composite: Një element që mund të përmbajë fëmijë të tjerë (p.sh., dosje që përmban skedarë ose nën-dosje).
 * @4. Client: Objekti që bashkëvepron me strukturën.
 * */

// Client: Përdor Composite Pattern
public class Main {
    public static void main(String[] args) {
        // Leaf: Krijojmë disa skedarë
        File file1 = new File("Document1.txt");
        File file2 = new File("Photo.jpg");
        File file3 = new File("Video.mp4");

        // Composite: Krijojmë një dosje dhe shtojmë skedarë
        Folder folder1 = new Folder("My Documents");
        folder1.add(file1);
        folder1.add(file2);

        // Composite: Krijojmë një dosje tjetër dhe shtojmë një skedar
        Folder folder2 = new Folder("Media");
        folder2.add(file3);

        // Composite: Krijojmë dosjen kryesore dhe shtojmë dosje dhe skedarë
        Folder mainFolder = new Folder("Root");
        mainFolder.add(folder1);
        mainFolder.add(folder2);

        // Tregojmë të gjithë strukturën
        mainFolder.showDetails();
    }
}