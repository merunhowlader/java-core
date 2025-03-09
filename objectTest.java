
class Computer {

    public void playMusic() {
        System.out.println("paly music");
    }

    public String getMePen(int cost) {
        return "pen";

    }
}

class Calculator {

    public int add(int n1, int n2) {

        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {

        return n1 + n2;
    }

}

class Student {

    int rollNo;
    String name;
    int marks;
}

class objectTest {

    public static void main(String[] args) {
        // Computer obj = new Computer();

        // obj.playMusic();;
        // String str = obj.getMePen(10);
        // System.out.println(str);
        // Calculator obj = new Calculator();
        // int r1 = obj.add(3, 4);
        // int r2 = obj.add(3, 4, 5);
        // System.out.println(r1);
        // int num[] = {5, 6, 67};
        // int num2[] = new int[6];
        //arrya
        int nums[] = {3, 7, 4, 3};

        System.out.println(nums[0]);

        int dy[] = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println(dy[i]);
        }

        int multi[][] = new int[3][4];

        // for (int i = 0; i < multi.length; i++) {
        //     for (int j = 0; j < multi[i].length; j++) {
        //         System.out.print(multi[i][j] + " ");
        //         multi[i][j] = (int) (Math.random() * 100);
        //     }
        //     System.out.println("");
        // }
        // for (int i = 0; i < multi.length; i++) {
        //     for (int j = 0; j < multi[i].length; j++) {
        //         System.out.print(multi[i][j] + " ");
        //     }
        //     System.out.println(" ");
        // }
        for (int n[] : multi) {

            for (int k : n) {
                System.out.print(k + " ");

            }
            System.out.println(" ");

        }

        int jagged[][] = new int[3][];
        jagged[0] = new int[3];
        jagged[1] = new int[4];
        jagged[2] = new int[2];

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "merun";
        s1.marks = 99;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "joy";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "udoy";
        s3.marks = 80;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].marks);
        }

        //this for each 
        for (Student student : students) {
            System.out.println(student.name + " " + student.marks);
        }
    }
}
