package com.nandica.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nandica.demo.entities.Project;
import com.nandica.demo.services.ProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectController {
	
	private final ProjectService projectService;
	
	@Autowired
	public ProjectController(ProjectService projectService){
		this.projectService = projectService;
	}
	
	@PostMapping("/create")
	public Project createProject(@RequestBody Project project) {
		return projectService.saveProject(project);
	}
	
	@GetMapping("/{id}")
	public Project getProject(@PathVariable Long id) {
		return projectService.findProjectById(id);
	}
	
	@GetMapping("/all")
	public List<Project> getAllProjects(){
		return projectService.findAllProjects();
	}
	
}