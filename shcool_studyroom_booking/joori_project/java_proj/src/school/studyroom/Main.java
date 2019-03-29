package school.studyroom;
import java.util.Scanner;
import school.studyroom.seat.*;

class Signin{
    public Db initDb(String id, String pw, String name){
        Db db = new Db();
        db.id = id;
        db.pw = pw;
        db.name = name;
        return db;
    }
}
class Db{
    String id, pw, name;
}
class Main{
    public static void main(String[] args){
        int init_choose,student_num=0;
        String id, pw, name;
        Db[] db_arr = new Db[10];
        Scanner scan = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {
            System.out.println("study room booking system ! ");
            System.out.println("1. sign in  2. login");

            init_choose = scan.nextInt();

            if (init_choose == 1) {
                System.out.println("sigin start : ");
                id = scan.next();
                pw = scan.next();
                name = scan.next();
                Signin signin = new Signin();
                Db db_item = signin.initDb(id, pw, name);
                db_arr[student_num] = db_item;
                student_num++;
            } else if (init_choose == 2) {
                System.out.println("login start : ");
                id = scan.next();
                pw = scan.next();

                for (int i = 0; i < student_num; i++) {
                    System.out.println(i);
                    if ((db_arr[i].id).equals(id)) {
                        System.out.println(db_arr[i].id);
                        flag = true;
                        if ((db_arr[i].pw).equals(pw)) {
                            System.out.println("login success ");
                            break;
                        } else {
                            System.out.println("wrong password ");
                        }
                    }
                }
                if (flag == false) System.out.println("wrong id ");

            }
        }//while
        boolean booking_flag = false;
        Seat seat = new Seat();
        while(!booking_flag) {
            System.out.println("current situation");
            int[] output = seat.total_info();
            int[][] output_map = seat.total_map();
            for (int i = 1; i <= output.length; i++) {
                System.out.println("room" + i + " :" + output[i - 1]);
                for (int j = 0; j < output_map[0].length; j++) {
                    if (output_map[i - 1][j] == 0) System.out.print("O ");
                    else System.out.print("@ ");
                }
                System.out.println();
            }

            System.out.println("1. book seat \n2. expend \n3. exit");

            int booking_choose = scan.nextInt();
            if(booking_choose == 1) {
                System.out.println("booking room number enter : ");
                int input_roomnum = scan.nextInt();
                int input_seatnum = scan.nextInt();
                boolean book_status = seat.update(input_roomnum, input_seatnum);
                if (book_status == true) {
                    System.out.println("booking success");
                    booking_flag = true;
                }
                else System.out.println("booking fail try again");
            }else if(booking_choose == 3){
                booking_flag = true;
            }
        }

    }
}
