public class Staff extends Person {
    private String position;

    // Constructor
    public Staff(String name, int yearOfBirth, String position) {
        super(name, yearOfBirth);
    }

    // Getter và Setter
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Phương thức hiển thị thông tin
    @Override
    public String getInfo() {
        return super.getInfo() + ", Chức vụ: " + position;
    }
}
