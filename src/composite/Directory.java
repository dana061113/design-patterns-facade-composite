package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(FileSystemComponent component) {
        if (!components.contains(component)) {
            components.add(component);
        } else {
            System.out.println("Қазірдің өзінде бар!");
        }
    }

    public void remove(FileSystemComponent component) {
        if (components.contains(component)) {
            components.remove(component);
        } else {
            System.out.println("Табылмады!");
        }
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Папка: " + name);
        for (FileSystemComponent c : components) {
            c.display(indent + "  ");
        }
    }

    @Override
    public int getSize() {
        int total = 0;
        for (FileSystemComponent c : components) {
            total += c.getSize();
        }
        return total;
    }
}
