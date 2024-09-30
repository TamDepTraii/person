public class Teacher extends Person {
    private String department; // Bộ môn

    // Constructor
    public Teacher(String name, int yearOfBirth, String department) {
        super(name, yearOfBirth);
        this.department = department;
    }

    // Getter và Setter
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Phương thức hiển thị thông tin
    @Override
    public String getInfo() {
        return super.getInfo() + ", Bộ môn: " + department;
    }
}
