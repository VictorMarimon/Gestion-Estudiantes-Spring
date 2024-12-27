package vm.estudiantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import vm.estudiantes.modelo.Estudiante;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Integer> {
}
