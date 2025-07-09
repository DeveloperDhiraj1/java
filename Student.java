
class Student {

    String name;
    int age;
    int roll_no;

    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
        roll_no = 9012;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("roll_no" + roll_no);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Dhiraj", 20);
        s1.display();
    }
}
