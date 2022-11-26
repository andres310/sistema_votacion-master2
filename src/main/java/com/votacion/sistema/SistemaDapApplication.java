package com.votacion.sistema;



import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.votacion.sistema.models.Departamentos;
import com.votacion.sistema.repositories.IDepartamentosRepository;

@SpringBootApplication
public class SistemaDapApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDapApplication.class, args);
	}

	@Autowired
	IDepartamentosRepository departamentoRepo;

	public void run(String... args) throws Exception {
		//guardarTodosDepartamentos();
	}

	private void guardarTodosDepartamentos() {
		List<Departamentos> departamentos = new LinkedList<Departamentos>();

		Departamentos departamento1 = new Departamentos();
		departamento1.setNombre("Ahuachapán");

		departamentos.add(departamento1);

		Departamentos departamento2 = new Departamentos();
		departamento2.setNombre("Cabañas");
		
		departamentos.add(departamento2);

		Departamentos departamento3 = new Departamentos();

		departamento3.setNombre("Chalatenango");

		departamentos.add(departamento3);

		Departamentos departamento4 = new Departamentos();
		departamento4.setNombre("Cuscatlán");

		departamentos.add(departamento4);

		Departamentos departamento5 = new Departamentos();
		departamento5.setNombre("La Libertad");
		
		departamentos.add(departamento5);
		
		Departamentos departamento6 = new Departamentos();
		departamento6.setNombre("La Paz");
		
		departamentos.add(departamento6);

		Departamentos departamento7= new Departamentos();
		departamento7.setNombre("La Unión");
		
		departamentos.add(departamento7);

		Departamentos departamento8 = new Departamentos();
		departamento8.setNombre("Morazán");
		
		departamentos.add(departamento8);

		Departamentos departamento9 = new Departamentos();
		departamento9.setNombre("San Miguel");
		
		departamentos.add(departamento9);
		
		Departamentos departamento10 = new Departamentos();
		departamento10.setNombre("San Salvador");
		
		departamentos.add(departamento10);
		
		Departamentos departamento11 = new Departamentos();
		departamento11.setNombre("San Vicente");
		
		departamentos.add(departamento11);
		
		Departamentos departamento12 = new Departamentos();
		departamento12.setNombre("Santa Ana");
		
		departamentos.add(departamento12);
		
		Departamentos departamento13 = new Departamentos();
		departamento13.setNombre("Sonsonate");
		
		departamentos.add(departamento13);
		
		Departamentos departamento14 = new Departamentos();
		departamento14.setNombre("Usulutan");
		departamentos.add(departamento14);

		departamentoRepo.saveAll(departamentos);

		System.out.println(departamentos.size() + " Departamentos se añadieron!");

	}

		
		 
	}

