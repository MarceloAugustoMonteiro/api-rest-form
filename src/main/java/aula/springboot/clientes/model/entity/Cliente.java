package aula.springboot.clientes.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, length = 150)
    private String cpf;

    @Column(nullable = false, length = 150)
    private String sexo;

    @Column(nullable = false, length = 150)
    private String estadoCivil;

    @Column(nullable = false, length = 150)
    private String usuarioLogin;

    @Column(nullable = false, length = 150)
    private String senha;

    @Column(nullable = false, length = 150)
    private String dataNascimento;


}
