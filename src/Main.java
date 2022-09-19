public class Main {
    public static void main(String[] args) {
        Student student = new Student("Максим","Кокунин","ОСА320/2",3.9);
        graduatestudents aspirant1 = new graduatestudents("Евгений","кисаров","ОСА419/2",4,"Work1");
        Student aspirant2 = new graduatestudents("Никита","Раев","ОСА419/2",3.7,"Work2");
        Student [] students = {student,aspirant1,aspirant2};
        for(Student s:students){
            System.out.println(s.getScholarship());
        }
    }
}