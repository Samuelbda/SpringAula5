// Pacote onde esta classe está localizada.
package com.example.demo.repository;

// Importação da interface JpaRepository, que fornece métodos prontos para operações com o banco de dados.
import org.springframework.data.jpa.repository.JpaRepository; // Interface para operações JPA.

// Importação comentada da interface MongoRepository, que seria usada caso o banco fosse MongoDB.
// import org.springframework.data.mongodb.repository.MongoRepository;

// Importação da anotação @Repository, que indica que esta interface é um repositório Spring.
import org.springframework.stereotype.Repository;

import com.example.demo.model.Produto;

// Anotação que marca esta interface como um repositório Spring, permitindo que o Spring a detecte e gerencie.
@Repository // Indica que esta interface é um repositório Spring.
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // A interface JpaRepository já fornece métodos padrão como salvar, deletar, buscar por ID, etc.
    // Não há métodos personalizados definidos aqui, mas eles podem ser adicionados conforme necessário.
}