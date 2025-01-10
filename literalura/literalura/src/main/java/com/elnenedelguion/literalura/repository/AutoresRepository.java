package com.elnenedelguion.literalura.repository;


import com.elnenedelguion.literalura.model.Autores;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface AutoresRepository extends JpaRepository<Autores, Long> {
    Autores findByNameIgnoreCase(String nombre);

    List<Autores> findByAñoNacimientoLessThanEqualAndAñoMuerteGreaterThanEqual
            (int añoInicial, int añoFinal);
}
