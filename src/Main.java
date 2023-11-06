import java.util.Scanner;

public class Main {
    private static java.lang.String String;

    public static void main(String[] args) {


//        University, School, Car жана Person деген класс тузунуз
//
//        Алардын свойстваларын ойлоп табыныз
//
//        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//
//        Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
//
//        Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарын
//        Student student = new Student("Nu" , 2);
//

        University university = new University();
        university.setUniversityName("И. Раззаков");
        university.setDirection("Инженер Программист");
        university.setPassingGrade(150);
        university.setTrainingPeriod(4);

        University [] univer = {university};
        for (int i = 0; i < univer.length; i++) {
            System.out.println(univer[i].getUniversityName()+"\n"+ university.getDirection()+"\n" + university.getPassingGrade()+"\n" + university.getTrainingPeriod()+"\n \n" );
        }


        School school = new School();
        school.setSchoolName("Тажибай");
        school.setAddress("Кыргыз - Ата");
        school.setQuantity(800);

        School [] mektep = {school};
        for (int i = 0; i < mektep.length; i++) {
            System.out.println(mektep[i].getSchoolName()+"\n" + school.getAddress()+"\n" + school.getQuantity()+"\n \n");

        }



    }
}