
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Input {

    public static void main(String[] args) throws NumberFormatException, IOException {

        //Input using bufferReader
        // System.out.println("Enter a number");
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println("Enter a number is :" + num);
        // bf.close();
        //Input with scanner
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println("Enter a number is :" + num);
        // try {
        // } catch (Exception e) {
        // } finally {
        // }
        //funally
        // BufferedReader bf = null;
        // int num = 0;
        // try {
        //     bf = new BufferedReader(new InputStreamReader(System.in));
        //     num = Integer.parseInt(bf.readLine());
        //     System.out.println(num);
        // } finally {
        //     bf.close();
        // }
        int num = 0;
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));) {

            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
    }
}
