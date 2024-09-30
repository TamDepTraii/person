public class Student extends Person {
    private String studentId; // Mã số sinh viên (MSSV)

    // Constructor
    public Student(String name, int yearOfBirth, String studentId) {
        super(name, yearOfBirth);
        this.studentId = studentId;
    }

    // Getter và Setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Phương thức hiển thị thông tin
    @Override
    public String getInfo() {
        return super.getInfo() + ", MSSV: " + studentId;
    }
}
