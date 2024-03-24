package LowLevelDesign.DesignPatterns.Prototype.Assignment2;

public interface InvoicePrototypeRegistry {

    void addPrototype(Invoice user);

    Invoice getPrototype(InvoiceType type);

    Invoice clone(InvoiceType type);
}
