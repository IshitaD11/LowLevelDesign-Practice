package ScalerLLD.DesignPatterns.Prototype.Assignment3;

public interface UserPrototypeRegistry {

    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}