package LowLevelDesign.DesignPatterns.Flyweight.Assignment1;

public interface FlyweightRegistry {

    void addFlyweight(UserIntrinsicState flyweight);

    UserIntrinsicState getFlyweight(String email);
}