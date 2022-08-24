import com.example.student.Student;

public class Main {

    public static void main(String[] args) {

       Student student = new Student();

         student.setName("Aedrian");
         student.setAge(23);
         student.setGender("Male");
         student.setIdNo(123);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getIdNo());
    }
}
