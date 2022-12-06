package ex2;

import ex2.VIPRoom;
import lombok.Getter;
import lombok.Setter;

public class VIPRoomCelebs extends VIPRoom {
    private @Setter @Getter float m_jaccuzi;

    public void  swimInJacuzzi(){
        System.out.println("Love it !");
    }
}
