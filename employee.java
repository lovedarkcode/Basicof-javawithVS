public class employee {

    int id;
    String name;
    int phone;
    int salary;

    public void print() {
        System.out.println(id + " " + name + " " + phone + " " + salary);
    }

    public static void main(String[] args) {
        employee e1 = new employee();
        e1.id = 101;
        e1.name = "John Doe";
        e1.phone = 98765432;
        e1.salary = 50000;
        e1.print();

        employee e2 = new employee();
        e2.id = 102;
        e2.name = "Jane Smith";
        e2.phone = 12345678;
        e2.salary = 60000;
        e2.print();

        employee e3 = new employee();
        e3.id = 103;
        e3.name = "Richard Roe";
        e3.phone = 11111111;
        e3.salary = 70000;
        e3.print();

        employee e4 = new employee();
        e4.id = 104;
        e4.name = "Charles Lee";
        e4.phone = 22222222;
        e4.salary = 80000;
        e4.print();
    }

}
