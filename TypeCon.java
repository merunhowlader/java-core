
class TypeCon {

    public static void main(String[] args) {
        //type change is not not possible but we can assign it to diffrent type if possible
        byte b = 120;
        int a = 384;

        //type casting 
        //use modular theory
        b = (byte) a;
        System.out.println(b);

        int x = 5;
        float y = 5.6f;

        x = (int) y;

        System.out.println(x);

        //type promotion
        byte g = 10;
        byte h = 30;

        int result = g * h;
        System.out.println(result);
    }
}
