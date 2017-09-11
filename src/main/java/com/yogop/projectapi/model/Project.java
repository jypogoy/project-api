package com.yogop.projectapi.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Date;

/**
 * Created by Jeffrey Y. Pogoy on 9/11/2017.
 */
@Data
@XmlRootElement
public class Project {

    private long id;
    private String name;
    private String description;
    private Date dateAdded;

    public Project() {
    }

    public Project(long id, String name, String description, Date dateAdded) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateAdded = dateAdded;
    }
}
