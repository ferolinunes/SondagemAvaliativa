package com.nandica.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandica.demo.entities.Project;
import com.nandica.demo.repositories.ProjectRepository;

@Service
public class ProjectService {
	private final ProjectRepository projectRepository;
	
	@Autowired
	public ProjectService (ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}
	
	public Project findProjectById(Long id) {
		Optional<Project> project = projectRepository.findById(id);
		return project.orElse(null);
	}
	
	public List<Project> findAllProjects(){
		return projectRepository.findAll();
	}
	
	public Project saveProject(Project project) {
		return projectRepository.save(project);
	}
}