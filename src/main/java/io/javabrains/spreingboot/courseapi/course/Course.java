package io.javabrains.spreingboot.courseapi.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import io.javabrains.spreingboot.courseapi.topic.Topic;

@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;
    @ManyToOne
    private Topic topic;

    public String getId() {
        return id;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Course() {

    }

    public Course(String id, String name, String description , String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId , "" , "");
    }
    
}
