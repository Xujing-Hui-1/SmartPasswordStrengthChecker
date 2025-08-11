import java.util.List;

/**
 * Interface for GUI
 * Allows for easy testing with mock implementations.
 */
public interface GUI {
    void updateStrength(String strength);
    void updateFeedback(List<String> feedback);
}
