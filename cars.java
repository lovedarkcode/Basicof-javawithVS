// Encapsulation

public class cars {
    private String name;
    private int number;
    private String typemodel;
    private int mileage;

    public void cars(String name, int number, String typemodel, int mileage) {
        this.name = name;
        this.number = number;
        this.typemodel = typemodel;
        this.mileage = mileage;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getnumber() {
        return number;
    }

    public void setnumber(int number) {
        this.number = number;
    }

    public String gettypemodel() {
        return typemodel;
    }

    public void settypemodel(String typemodel) {
        this.typemodel = typemodel;
    }

    public int getmileage() {
        return mileage;
    }

    public void setmileage(int mileage) {
        this.mileage = mileage;
    }

    public static void main(String[] args) {
        cars c1 = new cars();
        c1.setname("BMW");
        c1.setnumber(123);
        c1.settypemodel("Sedan");
        c1.setmileage(25);
        System.out.println(c1.getname() + " " + c1.getnumber() + " " + c1.getmileage() + " " + c1.gettypemodel());
        cars c2 = new cars();
        c2.setname("MAruti");
        c2.setnumber(456);
        c2.settypemodel("Sedan");
        c2.setmileage(20);
        System.out.println(c2.getname() + " " + c2.getnumber() + " " + c2.getmileage() + " " + c2.gettypemodel());
        cars c3 = new cars();
        c3.setname("Toyota");
        c3.setnumber(789);
        c3.settypemodel("SUV");
        c3.setmileage(21);
        System.out.println(c3.getname() + " " + c3.getnumber() + " " + c3.getmileage() + " " + c3.gettypemodel());
        cars c4 = new cars();
        c4.setname("AUDI");
        c4.setnumber(654);
        c4.settypemodel("SUV");
        c4.setmileage(15);
        System.out.println(c4.getname() + " " + c4.getnumber() + " " + c4.getmileage() + " " + c4.gettypemodel());
        cars c5 = new cars();
        c5.setname("Honda");
        c5.setnumber(007);
        c5.settypemodel("Sedan");
        c5.setmileage(18);
        System.out.println(c5.getname() + " " + c5.getnumber() + " " + c5.getmileage() + " " + c5.gettypemodel());
    }

}
