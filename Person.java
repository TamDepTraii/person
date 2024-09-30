public class Person {
    private String name;
    private int yearOfBirth;

    // Constructor
    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    // Phương thức hiển thị thông tin
    public String getInfo() {
        return "Họ tên: " + name + ", Năm sinh: " + yearOfBirth;
    }
}
