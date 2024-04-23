package LowLevelDesign.DesignPatterns.Flyweight.Assignment1;


// The UserExtrinsicState class represents the extrinsic state of a user.
// These are states that vary and cannot be shared.

@ExtrinsicState
public class UserExtrinsicState {
    private Colour colour; // The colour associated with the user
    private int currentGameStreak; // The current game streak of the user
    private UserIntrinsicState user; // The intrinsic state of the user
}
