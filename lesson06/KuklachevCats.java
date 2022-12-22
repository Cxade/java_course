
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class KuklachevCats {
    private String name;
    private String breed;
    private String color;
    private LocalDate birthDate;
    private List<Action> action;

    public KuklachevCats(String name, String breed, String color, LocalDate birthDate) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.birthDate = birthDate;
        this.action = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<Action> getAction() {
        return action;
    }

    @Override
    public String toString() {
        return "KuklachevCats [name=" + name + ", breed=" + breed + ", color=" + color + ", birthDate=" + birthDate
                + ", action=" + action + "]";
    }

    public void addTrick(Action act) {
        action.add(act);
    }
    //?
}
