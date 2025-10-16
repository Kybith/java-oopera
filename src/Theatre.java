public class Theatre {
    public static void main(String[] args) {
        System.out.println("=== НАЧИНАЕМ ПРЕДСТАВЛЕНИЕ ===\n");

        // 1. Создаем трёх актеров и двух режиссёров
        System.out.println("1. СОЗДАЕМ АКТЕРОВ И РЕЖИССЕРОВ");
        Actor actor1 = new Actor("Жан-клод", "Вандам", Gender.FEMALE, 1.99);
        Actor actor2 = new Actor("Ян", "Эфрон", Gender.MALE, 1.92);
        Actor actor3 = new Actor("Андрей", "Золотухин", Gender.FEMALE, 1.50);

        Director director1 = new Director("Тарас", "Матрас", Gender.MALE, 15);
        Director director2 = new Director("Оли", "Вье", Gender.FEMALE, 8);

        System.out.println("Актеры созданы: " + actor1 + ", " + actor2 + ", " + actor3);
        System.out.println("Режиссеры созданы: " + director1 + ", " + director2);
        System.out.println();

        // Создаем одного автора музыки и одного хореографа
        String musicAuthor = "П.И. Чайковский";
        String choreographer = "Мариус Петипа";
        System.out.println("Автор музыки: " + musicAuthor);
        System.out.println("Хореограф: " + choreographer);
        System.out.println();

        // 2. Создаем три спектакля: обычный, оперный и балет
        System.out.println("2. СОЗДАЕМ СПЕКТАКЛИ");
        Show regularShow = new Show("Вишневый сад", 120, director1);
        Opera opera = new Opera("Евгений Онегин", 150, director2, musicAuthor,
                "Опера в трех действиях по одноименному роману А.С. Пушкина. " +
                        "Рассказывает историю любви и разочарования молодого аристократа.", 20);
        Ballet ballet = new Ballet("Лебединое озеро", 135, director1, musicAuthor,
                "В основе балета лежит старинная немецкая легенда о прекрасной принцессе Одетте, " +
                        "превращенной в лебедя проклятием злого волшебника.", choreographer);

        System.out.println("Создан обычный спектакль: " + regularShow.title);
        System.out.println("Создана опера: " + opera.title);
        System.out.println("Создан балет: " + ballet.title);
        System.out.println();

        // 3. Распределяем актёров по спектаклям
        System.out.println("3. РАСПРЕДЕЛЯЕМ АКТЕРОВ ПО СПЕКТАКЛЯМ");

        // Один актёр может участвовать в нескольких спектаклях
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println();

        // 4. Для каждого спектакля выводим на экран список актёров
        System.out.println("4. СПИСКИ АКТЕРОВ В СПЕКТАКЛЯХ");

        System.out.println("--- Обычный спектакль ---");
        regularShow.printActors();
        System.out.println();

        System.out.println("--- Опера ---");
        opera.printActors();
        System.out.println();

        System.out.println("--- Балет ---");
        ballet.printActors();
        System.out.println();

        // 5. Заменяем актёра в одном из спектаклей
        System.out.println("5. ЗАМЕНА АКТЕРА В СПЕКТАКЛЕ");
        System.out.println("Заменяем актера в опере:");
        opera.replaceActor(actor1, "Иванов"); // Заменяем Петра Иванова на Анну Сидорову
        System.out.println();

        // Выводим обновленный список актеров для оперы
        System.out.println("Обновленный список актеров в опере:");
        opera.printActors();
        System.out.println();

        // 6. Пробуем заменить в другом спектакле несуществующего актёра
        System.out.println("6. ПЫТАЕМСЯ ЗАМЕНИТЬ НЕСУЩЕСТВУЮЩЕГО АКТЕРА");
        ballet.replaceActor(actor2, "НесуществующаяФамилия");
        System.out.println();

        // 7. Для оперного и балетного спектакля выводим на экран текст либретто
        System.out.println("7. ЛИБРЕТТО МУЗЫКАЛЬНЫХ СПЕКТАКЛЕЙ");

        System.out.println("=== ЛИБРЕТТО ОПЕРЫ ===");
        opera.printLibretto();
        System.out.println();

        System.out.println("=== ЛИБРЕТТО БАЛЕТА ===");
        ballet.printLibretto();
        System.out.println();

        // Финальное сообщение
        System.out.println("=== ПРЕДСТАВЛЕНИЕ НАЧАЛОСЬ! ===");
        System.out.println("Зрители наслаждаются спектаклями, а за кулисами театра всё разложено по полочкам!");

        // Дополнительная информация о спектаклях
        System.out.println("\n=== ИНФОРМАЦИЯ О ВСЕХ СПЕКТАКЛЯХ ===");
        System.out.println("Обычный спектакль: " + regularShow);
        System.out.println("Опера: " + opera);
        System.out.println("Балет: " + ballet);
    }
}