import java.util.ArrayList;
import java.util.List;

// Subject (Observable) Interface
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}

// Concrete Subject (Observable)