
//enum can have different constant
enum Status {
    Running, Failed, Pending, Success;
}

enum Laptop {
    Mackbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    // public double getPrice() {
    //     return price;
    // }
}

class Enum {

    public static void main(String[] args) {
        // Status s = Status.Success;
        // System.out.println(s);
        // System.out.println(s.ordinal());

        // Status[] ss = Status.values();
        // System.out.println(ss);
        // System.out.println(ss[0]);
        // for (Status s : ss) {
        //     System.out.print(s.ordinal());
        //     System.out.println(s);
        // }
        // Laptop lap = Laptop.Mackbook;
        // System.out.println(lap);
        for (Laptop lap : Laptop.values()) {

            System.out.println(lap);
        }
    }

}
//enum class

