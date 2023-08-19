package com.example.springboot.models;

import jakarta.persistence.*; // Importa as anotações do JPA (Java Persistence API)
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity // Marca a classe como uma entidade JPA
@Table(name = "products") // Mapeia a tabela do banco de dados associada a essa entidade
public class ProductModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id // Marca o campo como a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.AUTO) // Gera o Id das tabelas de forma automática
    private UUID idProduct; // Campo para o ID do produto (do tipo UUID)

    private String name; // Campo para o nome do produto

    private BigDecimal value; // Campo para o valor do produto

    // Métodos getters e setters para os campos

    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}