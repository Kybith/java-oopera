import java.util.Objects;

class Actor extends Person {
    public double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return getFullName() + " (" + height + " м)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Double.compare(actor.height, height) == 0 &&
                name.equals(actor.name) &&
                surname.equals(actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}