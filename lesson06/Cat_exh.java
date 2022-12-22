import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cat_exh {
    private String name;
    private String breed;
    private String color;
    private LocalDate birthDate;
    private List<Award> awards;
    private String owner;
    
    public Cat_exh(String name, String breed, String color, LocalDate birthDate, String owner) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.birthDate = birthDate;
        this.owner = owner;
        this.awards = new ArrayList<>();
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


    public String getOwner() {
        return owner;
    }

    // public List<Award> getAwards() {
    //     return new ArrayList<>(awards);
    // }

    @Override
    public String toString() {
        return "Cat_exh [name=" + name + ", breed=" + breed + ", color=" + color + ", birthDate=" + birthDate
                + ", awards=" + awards + ", owner=" + owner + "]";
    }

    public void addAward(Award award) {
        this.awards.add(award);
    }

}
