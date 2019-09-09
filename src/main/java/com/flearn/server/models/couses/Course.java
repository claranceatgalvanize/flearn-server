package com.flearn.server.models.couses;

import com.flearn.server.models.authors.Author;
import com.flearn.server.models.topics.Topic;
import com.flearn.server.models.users.User;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    private String id;
    private String name;
    private String description;
    @ManyToOne
    private Topic topic;
    @ManyToOne
    private Author author;
    @ManyToOne
    private User user;

    public Course() {
    }

    public Course(String id, String name, String description, String topicId, String authorId, String userId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
        this.author = new Author(authorId, "", "", "", "", "");
        this.user = new User(userId, "", "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
