import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
}
