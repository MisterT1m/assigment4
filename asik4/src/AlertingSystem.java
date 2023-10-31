import java.util.ArrayList;
import java.util.List;


class AlertingSystem implements Observer {
    private String name;

    public AlertingSystem(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received a notification: " + message);
    }
}