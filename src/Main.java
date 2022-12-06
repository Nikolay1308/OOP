import ex2.*;

public class Main {
    static void callCleaner(Room room){
        room.cleanRoom();
    }
    static void partyAtVIPRoom(VIPRoom vipRoom){
        vipRoom.party();
    }
    public static void main(String[] args) {
    Room room = new Room();
    StandardRoom room_st = new StandardRoom();
    VIPRoom viproom = new VIPRoom();
    VIPRoomCelebs viproom_c = new VIPRoomCelebs();
    VIPRoomPresidents viproom_p = new VIPRoomPresidents();
    Room[] list_room = new Room[5];
    list_room[0] = new Room();
    list_room[1] = new StandardRoom();
    list_room[2] = new VIPRoom();
    list_room[3] = new VIPRoomCelebs();
    list_room[4] = new VIPRoomPresidents();
    callCleaner(list_room[0]);
    callCleaner(list_room[1]);
    callCleaner(list_room[2]);
    callCleaner(list_room[3]);
    callCleaner(list_room[4]);
    partyAtVIPRoom(viproom_p);
    partyAtVIPRoom(viproom_c);
    partyAtVIPRoom(viproom);


    }

}