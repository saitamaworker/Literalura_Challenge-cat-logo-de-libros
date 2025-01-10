package com.elnenedelguion.literalura.repository;

import com.elnenedelguion.literalura.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface LibrosRepository extends JpaRepository<Libros, Long> {
    Libros findByTitulo(String titulo);
    List<Libros> findByLenguajesContaining(String lenguaje);
}


