package com.schooleat.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooleat.cursomc.domain.Categoria;
import com.schooleat.cursomc.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) throws ObjectNotFoundException {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + ", Tipo: " + Categoria.class.getName()));
	}
	
}
