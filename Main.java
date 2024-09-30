public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Student
        Student student1 = new Student("Le Van Tam", 2005, "23020567");
        System.out.println(student1.getInfo());

        // Tạo đối tượng Teacher
        Teacher teacher1 = new Teacher("Dr. Le Van Tuyen", 2001, "Computer Science");
        System.out.println(teacher1.getInfo());

        // Tạo đối tượng Staff
        Staff staff1 = new Staff("Nguyen Van Long", 1994, "Administrative Staff");
        System.out.println(staff1.getInfo());
    }
}
