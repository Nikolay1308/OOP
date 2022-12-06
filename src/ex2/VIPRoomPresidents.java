package ex2;

import ex2.VIPRoom;
import lombok.Getter;
import lombok.Setter;

public class VIPRoomPresidents extends VIPRoom {
    private @Setter @Getter int m_guards;

    public void addGuard() {
        this.m_guards = this.m_guards+1;
    }

    public float getMiniBarSize() {
        return this.getM_mini_bar_size();
    }
}
