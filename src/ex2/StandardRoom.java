package ex2;

import lombok.Getter;
import lombok.Setter;




public class StandardRoom extends Room {
    private @Getter @Setter int m_small_vault_code;

    public void reetVaultCode(){
        System.out.println("Ok");
    }
}
