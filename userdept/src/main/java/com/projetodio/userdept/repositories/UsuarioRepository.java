package com.projetodio.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetodio.userdept.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	
}
