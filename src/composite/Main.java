package composite;

public class Main {
    public static void main(String[] args) {

        Directory root = new Directory("Root");

        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.txt", 20);

        Directory folder1 = new Directory("Folder1");
        Directory folder2 = new Directory("Folder2");

        folder1.add(new File("file3.txt", 30));
        folder2.add(new File("file4.txt", 40));

        root.add(file1);
        root.add(file2);
        root.add(folder1);
        root.add(folder2);

        root.display("");
        System.out.println("\nЖалпы размер: " + root.getSize() + " KB");
    }
}
