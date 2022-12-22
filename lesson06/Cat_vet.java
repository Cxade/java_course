public class Cat_vet {
    private String name;
    private String owner;
    private String breed;
    private float weight;

    
    public Cat_vet(String name, String owner, String breed, float weight) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.weight = weight;
    }

    public void meow () {
        System.out.println("Meow!");
    }




    @Override

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getBreed() {
        return breed;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Cat [name=" + name + ", owner=" + owner + ", breed=" + breed + ", weight=" + weight + "]";
    }
}
