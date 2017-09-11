package com.yogop.projectapi.controller;

import com.yogop.projectapi.model.Project;
import com.yogop.projectapi.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Jeffrey Y. Pogoy on 9/11/2017.
 */
@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @RequestMapping(value = "{id}")
    public Project getProject(@PathVariable long id) {
        return projectService.getProject(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void addProject(@RequestBody Project project) {
        projectService.addProject(project);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public void updateProject(@PathVariable long id, @RequestBody Project project) {
        projectService.updateProject(id, project);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteProject(@PathVariable long id) {
        projectService.deleteProject(id);
    }
}
