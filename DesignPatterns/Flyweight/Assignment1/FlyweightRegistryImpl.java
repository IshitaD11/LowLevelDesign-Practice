package LowLevelDesign.DesignPatterns.Flyweight.Assignment1;

import java.util.Map;
import java.util.HashMap;

public class FlyweightRegistryImpl implements FlyweightRegistry {
    private Map<String, UserIntrinsicState> registry = new HashMap<>(); // The registry for storing flyweight objects

    // The addFlyweight method adds a flyweight object to the registry.
    @Override
    public void addFlyweight(UserIntrinsicState flyweight) {
        registry.put(flyweight.getEmail(), flyweight);
    }

    // The getFlyweight method retrieves a flyweight object from the registry.
    @Override
    public UserIntrinsicState getFlyweight(String email) {
        return registry.get(email);
    }
}
