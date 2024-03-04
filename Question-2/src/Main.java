// Abstract class representing a furniture product
abstract class Furniture {
    abstract void display();
}

// Chair family
class Chair extends Furniture {
    private String type;

    public Chair(String type) {
        this.type = type;
    }

    @Override
    void display() {
        System.out.println(type + " Chair");
    }
}

// Sofa family
class Sofa extends Furniture {
    private String type;

    public Sofa(String type) {
        this.type = type;
    }

    @Override
    void display() {
        System.out.println(type + " Sofa");
    }
}

// CoffeeTable family
class CoffeeTable extends Furniture {
    private String type;

    public CoffeeTable(String type) {
        this.type = type;
    }

    @Override
    void display() {
        System.out.println(type + " CoffeeTable");
    }
}

// Factory interface for creating furniture objects
interface FurnitureFactory {
    Chair createChair(String type);
    Sofa createSofa(String type);
    CoffeeTable createCoffeeTable(String type);
}

// Concrete factory implementation for creating Modern style furniture
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(String type) {
        return new Chair("Modern " + type);
    }

    @Override
    public Sofa createSofa(String type) {
        return new Sofa("Modern " + type);
    }

    @Override
    public CoffeeTable createCoffeeTable(String type) {
        return new CoffeeTable("Modern " + type);
    }
}

// Concrete factory implementation for creating Victorian style furniture
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(String type) {
        return new Chair("Victorian " + type);
    }

    @Override
    public Sofa createSofa(String type) {
        return new Sofa("Victorian " + type);
    }

    @Override
    public CoffeeTable createCoffeeTable(String type) {
        return new CoffeeTable("Victorian " + type);
    }
}

// Concrete factory implementation for creating ArtDeco style furniture
class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(String type) {
        return new Chair("ArtDeco " + type);
    }

    @Override
    public Sofa createSofa(String type) {
        return new Sofa("ArtDeco " + type);
    }

    @Override
    public CoffeeTable createCoffeeTable(String type) {
        return new CoffeeTable("ArtDeco " + type);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Modern style furniture
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair("Chair");
        Sofa modernSofa = modernFactory.createSofa("Sofa");
        CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable("CoffeeTable");

        modernChair.display();
        modernSofa.display();
        modernCoffeeTable.display();

        // Create a Victorian style furniture
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair("Chair");
        Sofa victorianSofa = victorianFactory.createSofa("Sofa");
        CoffeeTable victorianCoffeeTable = victorianFactory.createCoffeeTable("CoffeeTable");

        victorianChair.display();
        victorianSofa.display();
        victorianCoffeeTable.display();

        // Create an ArtDeco style furniture
        FurnitureFactory artDecoFactory = new ArtDecoFurnitureFactory();
        Chair artDecoChair = artDecoFactory.createChair("Chair");
        Sofa artDecoSofa = artDecoFactory.createSofa("Sofa");
        CoffeeTable artDecoCoffeeTable = artDecoFactory.createCoffeeTable("CoffeeTable");

        artDecoChair.display();
        artDecoSofa.display();
        artDecoCoffeeTable.display();
    }
}
