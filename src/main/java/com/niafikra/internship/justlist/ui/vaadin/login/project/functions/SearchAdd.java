package com.niafikra.internship.justlist.ui.vaadin.login.project.functions;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

/**
 * Created by lilianngweta on 7/11/16.
 */
public class SearchAdd extends HorizontalLayout{

    private TextField searchBar;
    private Button addProject;
    private AddProjectWindow addProjectWindow;

    public SearchAdd(){

        searchBar = new TextField();
        addProject = new Button("Add");


        build();
    }

    private void build() {

        //searchBar.setWidth("100px");
        addComponent(searchBar);

        //addProject.setWidth("50px");
        addComponent(addProject);

        setSpacing(true);

       addProject.addClickListener(event -> {

           addProjectWindow = new AddProjectWindow();

           //setComponentAlignment(addProjectWindow, Alignment.MIDDLE_CENTER);


        });


    }


}