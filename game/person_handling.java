package game;

public class person_handling {
    variables var = new variables();

    public void checkInspectorDay() {
        boolean inspector_day = var.get_is_inspector_day();
        if (inspector_day) {
            System.out.println("Inspector day");
        } else {
            System.out.println("Not inspector day");
        }
    }
}