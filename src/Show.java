import java.util.ArrayList;
import java.util.List;
// Базовый класс для всех спектаклей
public class Show {
    public String title;
    public int duration;
    public Director director;
    public List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    // Метод для печати информации о режиссере
    public void printDirectorInfo() {
        System.out.println("Режиссер спектакля '" + title + "': " + director);
    }

    // Метод для печати списка актеров
    public void printActors() {
        System.out.println("Актеры спектакля '" + title + "':");
        if (listOfActors.isEmpty()) {
            System.out.println("  В спектакле пока нет актеров");
        } else {
            for (int i = 0; i < listOfActors.size(); i++) {
                Actor actor = listOfActors.get(i);
                System.out.println("  " + (i + 1) + ". " + actor.name + " " +
                        actor.surname + " (" + actor.height + " м)");
            }
        }
    }

    // Метод для добавления актера с проверкой на дубликат
    public boolean addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Предупреждение: Актер " + actor.name + " " +
                    actor.surname + " уже участвует в спектакле '" + title + "'");
            return false;
        }
        listOfActors.add(actor);
        System.out.println("Актер " + actor.name + " " +
                actor.surname + " добавлен в спектакль '" + title + "'");
        return true;
    }

    // Метод для замены актера
    public boolean replaceActor(Actor newActor, String oldActorSurname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.surname.equals(oldActorSurname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актер " + currentActor.name + " " +
                        currentActor.surname + " заменен на " +
                        newActor.name + " " + newActor.surname +
                        " в спектакле '" + title + "'");
                return true;
            }
        }
        System.out.println("Предупреждение: Актер с фамилией '" + oldActorSurname +
                "' не найден в спектакле '" + title + "'");
        return false;
    }

    @Override
    public String toString() {
        return "Спектакль: '" + title + "', продолжительность: " +
                duration + " мин, режиссер: " + director.name + " " + director.surname;
    }
}