package Interface;

public class Student {
    static int id = 0;
    private int curId;
    private String name;
    private String address;

    public Student(String name, String address) {
        curId = id++;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [id=" + curId + ", name=" + name + ", address=" + address + "]";
    }
}
