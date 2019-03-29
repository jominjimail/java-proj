package school.studyroom.seat;

public class Seat {
    Db_seat seat1 = new Db_seat();
    Db_seat seat2 = new Db_seat();

    public int[] total_info(){
        int[] total_num = new int[2];
        total_num[0] = seat1.seat_info();
        total_num[1] = seat2.seat_info();
        return  total_num;
    }

    public int[][] total_map(){
        int [][] map = new int[2][4];
        map[0] = seat1.seat_map();
        map[1] = seat2.seat_map();
        return map;
    }

    public boolean update(int room_num,int seat_num){
        if(room_num == 1){
            return seat1.seat_update(seat_num-1);
        }else if(room_num ==2){
            return seat2.seat_update(seat_num-1);
        }
        else return false;
    }
}

class Db_seat {
    int[] room = new int[4];
    int room_num = 0;

    int seat_info(){
        return room_num;
    }

    int[] seat_map(){
        return room;
    }

    boolean seat_update(int seat_num){
        boolean sit = false;
        if(room[seat_num] == 0) {
            room[seat_num] = 1;
            sit = true;
        }
        return sit;
    }


}
