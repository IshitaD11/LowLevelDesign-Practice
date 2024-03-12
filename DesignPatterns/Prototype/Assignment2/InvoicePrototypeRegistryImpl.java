package ScalerLLD.DesignPatterns.Prototype.Assignment2;

import java.util.HashMap;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry{
    HashMap<InvoiceType,Invoice> registry = new HashMap<>();

    @Override
    public void addPrototype(Invoice user) {
        registry.put(user.getType(),user);
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return registry.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        return registry.get(type).cloneObject();
    }
    
}
