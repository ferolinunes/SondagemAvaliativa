package com.nandica.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandica.demo.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
