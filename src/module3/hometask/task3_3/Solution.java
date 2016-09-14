package module3.hometask.task3_3;

import java.sql.Date;

/**
 * Created by Mykhailo on 9/1/2016.
 */
public class Solution {
    public static void main(String[] args) {
        Date startDate = new Date(2016-9-1);

        Course linearAlgebra = new Course(40, "linear algebra", "Mike");
        Course statistics = new Course(40, "statistics", "Bob");
        Course literature = new Course(40, "literature", "Jane");
        Course economics = new Course(40, "economics", "John");
        Course econometrics = new Course(startDate,"econometrics");

        Course[] coursesTaken = {economics, literature};

        Student vova = new Student("Volodymyr", "Petrenko", 7);
        Student vasya = new Student("Ryabchenko", coursesTaken);
        Student petya = new Student("Petro", "Kochuk", 7, coursesTaken, 18);

        CollegeStudent misha = new CollegeStudent("Mykhailo", "Senchuk", 7);
        CollegeStudent oleg = new CollegeStudent("Sydorenko", coursesTaken);
        CollegeStudent andriy = new CollegeStudent("Andriy", "Kalagurko", 7, coursesTaken, 18, "KNEU", 29, 123141351);

        SpecialStudent ivan = new SpecialStudent("Ivan", "Poroshenko", 7);
        SpecialStudent alex = new SpecialStudent("Azarov", coursesTaken);
        SpecialStudent anna = new SpecialStudent("Anna", "Leonidivna", 7, coursesTaken, 18, "KNEU", 29, 123141351, 2143134);
    }
}
