package vm.estudiantes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vm.estudiantes.modelo.Estudiante;
import vm.estudiantes.servicio.EstudianteServicio;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {

	@Autowired
	private EstudianteServicio estudianteServicio;

	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

	String nl = System.lineSeparator();

	public static void main(String[] args) {
		SpringApplication.run(EstudiantesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		boolean salir = true;
		Scanner entrada = new Scanner(System.in);
		while(salir){
			mostrarMenu();
			salir = ejercutarOpciones(entrada);
			logger.info(nl);
		}
	}

	private void mostrarMenu(){
		logger.info(nl);
		logger.info("""
				***Sistema de gestión de estudiantes***
				1. Listar Estudiantes
				2. Buscar Estudiante
				3. Agregar Estudiante
				4. Modificar Estudiante
				5. Eliminar Estudiante
				6. Salir
				Elige una opción: """);
	}

	private boolean ejercutarOpciones(Scanner entrada){
		var opcion = Integer.parseInt(entrada.nextLine());
		var salir = true;
		switch (opcion){
			case 1->{
				logger.info(nl+"----Listado estudiantes----"+nl);
				List<Estudiante> estudiante = estudianteServicio.listarEstudiantes();
				estudiante.forEach(estudiantes -> logger.info(estudiantes.toString() + nl));
			}
			case 2->{
				logger.info(nl+"----Busqueda estudiante----"+nl);
				logger.info(nl+"Ingresa el id:");
				var idEstudiante = Integer.parseInt(entrada.nextLine());
				Estudiante estudiante = estudianteServicio.buscarEstudianteId(idEstudiante);
				if (estudiante!=null){
					logger.info(nl+"Estudiante encontrado: " + estudiante.toString());
				}else{
					logger.info(nl+"El estudiante con ID " + idEstudiante + " no existe");
				}
			}
			case 3->{
				logger.info(nl+"----Agregar estudiante----"+nl);
				logger.info("Nombre: ");
				var nombre = entrada.nextLine();
				logger.info("Apellido: ");
				var	apellido = entrada.nextLine();
				logger.info("Telefono: ");
				var telefono = entrada.nextLine();
				logger.info("Email: ");
				var email = entrada.nextLine();

				Estudiante est = new Estudiante();
				est.setNombre(nombre);
				est.setApellido(apellido);
				est.setTelefono(telefono);
				est.setEmail(email);

				estudianteServicio.guardarEstudiante(est);
				logger.info(nl+ "Estudiante agregado: " + est.toString());
			}
			case 4->{
				logger.info(nl+"----Modificar estudiante----"+nl);
				logger.info("Id: ");
				var id = Integer.parseInt(entrada.nextLine());

				Estudiante est = estudianteServicio.buscarEstudianteId(id);

				if (est!=null){
					logger.info("Nombre: ");
					var nombre = entrada.nextLine();
					logger.info("Apellido: ");
					var	apellido = entrada.nextLine();
					logger.info("Telefono: ");
					var telefono = entrada.nextLine();
					logger.info("Email: ");
					var email = entrada.nextLine();
					
					est.setId_estudiante(id);
					est.setNombre(nombre);
					est.setApellido(apellido);
					est.setTelefono(telefono);
					est.setEmail(email);

					estudianteServicio.guardarEstudiante(est);
					logger.info(nl+ "Estudiante modificado: " + est.toString());
				}else {
					logger.info(nl+"El estudiante con ID " + id +" no existe");
				}
			}
			case 5->{
				logger.info(nl+"----Eliminar estudiante----"+nl);
				logger.info(nl+"Ingresa el id:");
				var idEstudiante = Integer.parseInt(entrada.nextLine());
				Estudiante estudiante = estudianteServicio.buscarEstudianteId(idEstudiante);
				if (estudiante!=null){
					estudianteServicio.eliminarEstudiante(estudiante);
					logger.info(nl+"Estudiante eliminado: " + estudiante.toString());
				}else{
					logger.info(nl+"El estudiante con ID " + idEstudiante + " no existe");
				}
			}
			case 6->{
				salir = false;
				logger.info(nl+ nl+ "Programa finalizado");
			}
			default -> {
				logger.info(nl+"Seleccione una opción correcta");
			}
		}
		return salir;
	}
}
