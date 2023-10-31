import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();

        AlertingSystem alertSystem1 = new AlertingSystem("Alert System 1");
        AlertingSystem alertSystem2 = new AlertingSystem("Alert System 2");

        monitor.addObserver(alertSystem1);
        monitor.addObserver(alertSystem2);

        monitor.triggerAlert("High CPU Usage");

    }
}
