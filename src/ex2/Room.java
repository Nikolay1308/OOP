package ex2;

import lombok.Getter;
import lombok.Setter;

public class Room {
    private @Getter @Setter boolean m_isClean;
    private @Getter @Setter boolean m_free;
    private@Getter @Setter int m_number;
    private @Getter @Setter float m_size;
    private @Getter @Setter int m_floor;
    private @Getter @Setter boolean m_smoking;

    public void cleanRoom(){
        System.out.println("The room is clean");
        this.m_isClean=true;
    }
    public void evacuateRoom(){
        System.out.println("In progress");
        this.m_free=true;
    }
}
