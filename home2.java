/**
 * Created by فونكس تكنولوجي on 10/02/2021.
 */
public class home2 {
    public static void main(String[] args) {

        int x[] = new int[5];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;
        x[4] = 5;
        int backuparray[] = new int[5];

        for (int i = 0; i < x.length; i++) {

            backuparray[i] = x[i];
        }

        for (Integer integer : backuparray) {
            System.out.println(integer);
        }




    }

}




