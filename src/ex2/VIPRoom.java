package ex2;

import lombok.Getter;
import lombok.Setter;

public class VIPRoom extends Room {
    private @Getter @Setter float m_mini_bar_size;

    public void party(){
        System.out.println("Good Party !");
    }
}
