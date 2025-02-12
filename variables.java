package game;

public class variables {

    public int day = 1;
    public int money;
    public int mistakes;
    public int mistakes_since_inspector;
    public boolean is_inspector_day;
    public boolean new_thingy_day;
    public int number_of_visitors;
    public int number_of_visitors_on_day;
    public boolean is_georgie_spawn;
    public int number_of_geogies;
    public int fake_chance;
    public boolean is_fake;

    public int get_day() {
        return day;
    }
    public void modify_day() {
        day++;
    }

    public int get_money() {
        return money;
    }
    public void modify_money(int amount) {
        money = money + amount;
    }

    public int mistakes() {
        return mistakes;
    }
    public void modify_mistakes(int amount) {
        mistakes = mistakes + amount;
    }

    public int getMistakes_since_inspector() {
        return mistakes_since_inspector;
    }
    public void modify_mistakes_since_inspector(int amount) {
        mistakes_since_inspector = mistakes_since_inspector + amount;
    }
    public void reset_mistakes_since_inspector() {
        mistakes_since_inspector = 0;
    }

    public boolean get_is_inspector_day() {
        return is_inspector_day;
    }
    public void set_is_inspector_day(boolean value) {
        is_inspector_day = value;
    }

    public boolean isNew_thingy_day() {
        return new_thingy_day;
    }
    public void set_new_thingy_day(boolean value) {
        new_thingy_day = value;
    }

    public int get_number_of_visitors() {
        return number_of_visitors;
    }
    public void modify_number_of_visitors(int amount) {
        number_of_visitors = number_of_visitors + amount;
    }

    public int get_number_of_visitors_on_day() {
        return number_of_visitors_on_day;
    }
    public void modify_number_of_visitors_on_day(int amount) {
        number_of_visitors_on_day = number_of_visitors_on_day + amount;
    }
    public void reset_number_of_visitors_on_day() {
        number_of_visitors_on_day = 0;
    }

    public boolean get_is_georgie_spawn() {
        return is_georgie_spawn;
    }
    public void set_is_georgie_spawn(boolean value) {
        is_georgie_spawn = value;
    }

    public int get_number_of_geogies() {
        return number_of_geogies;
    }
    public void modify_number_of_geogies(int amount) {
        number_of_geogies = number_of_geogies + amount;
    }

    public int get_fake_chance() {
        return fake_chance;
    }

    public boolean get_is_fake() {
        return is_fake;
    }
    public void set_is_fake(boolean value) {
        is_fake = value;
    }
}
