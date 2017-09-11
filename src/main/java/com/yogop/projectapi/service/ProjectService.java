package com.yogop.projectapi.service;

import com.yogop.projectapi.model.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jeffrey Y. Pogoy on 9/11/2017.
 */
@Service
public class ProjectService {

    List<Project> projects = new ArrayList<>(Arrays.asList(
        new Project(1, "Project 1", "Project 1 description", null),
        new Project(2, "Project 1", "Project 1 description", null),
        new Project(3, "Project 1", "Project 1 description", null)
    ));


    public List<Project> getAllProjects() {
        return projects;
    }

    public Project getProject(long id) {
        return projects.stream().filter(p -> p.getId() == id).findFirst().get();
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void updateProject(long id, Project project) {
        for (int i = 0; i < projects.size(); i++) {
            Project p = projects.get(i);
            if (p.getId() == id) {
                projects.set(i, project);
                return;
            }
        }
    }

    public void deleteProject(long id) {
        projects.removeIf(p -> p.getId() == id);
    }
}
