package homework10;

/**
 * @author: Sean
 * @date: 2024/10/20
 * @project: HomeWork
 */
public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("John", 35, "Surgeon", 'M', 8000);
        doctor.printInfo();
        Doctor doctor1 = new Doctor("Mary", 40, "Pediatrician", 'F', 6500);
        System.out.println(doctor.equals(doctor1));
        Doctor doctor2 = new Doctor("John", 35, "Surgeon", 'M', 8000);
        System.out.println(doctor.equals(doctor2));
    }
}
