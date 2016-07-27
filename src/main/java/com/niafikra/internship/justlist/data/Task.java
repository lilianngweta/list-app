package com.niafikra.internship.justlist.data;

/**
 * Created by lilianngweta on 7/14/16.
 */

public class Task {

    private Long id;
    private String name;
    private Project project;
    private boolean completed;

    public Task() {

    }

    public Task(Long id, String name, Project project, Boolean completed) {

        this.id = id;
        this.name = name;
        this.project = project;
    }

    public User getUser() {
        if (project == null) return null;
        return project.getUser();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
