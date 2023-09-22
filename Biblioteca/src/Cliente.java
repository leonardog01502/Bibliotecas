import java.sql.Date;
import javax.swing.*;
public class Cliente {
    public int id_Cliente;
    private String Nome;
    private Date Data_Nascimento;
    private Enum Sexo;
    private String CPF;
    private String Endereco;
    private String Fone;

    public Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }
}
