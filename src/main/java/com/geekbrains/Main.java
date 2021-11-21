package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        Person persArray[] = new Person[5];
        persArray[0] = new Person("Петров Иван Сергеевич", "Java-daveloper","1111@yandex.ru",
                "89254362815",150000,35);
        persArray[1] = new Person("Иванов Сергей Анатольевич", "Java-daveloper","2222@yandex.ru",
                "89224364835",140000,45);
        persArray[2] = new Person("Андреев Антон Васильевич", "Java-daveloper","1212@yandex.ru",
                "89254467868",160000,37);
        persArray[3] = new Person("Мухин Евгений Иванович", "Java-daveloper","1313@yandex.ru",
                "89268249014",120000,34);
        persArray[4] = new Person("Песков Артем Владимирович", "Java-daveloper","1414@yandex.ru",
                "89285652868",135000,42);

        for (int i = 0; i < persArray.length; i++){
            if (persArray[i].getAge() > 40){
                persArray[i].infoAboutPerson();
            }
        }
    }

}
