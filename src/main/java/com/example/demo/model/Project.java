package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name; 

    @Column
    private String description;
    
    @Column
    private boolean status;

    @Column
    private LocalDateTime startDate;

    @Column
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name="categoryId") 
    private Category category;

    @ManyToMany
    private Set<User> users; 

    @OneToMany(mappedBy = "project")
    private Set<ArchivesProject> archives;

    @OneToMany(mappedBy = "project")
    private Set<MessageProject> messages;

    @OneToMany(mappedBy = "project")
    private Set<FeedBackProject> feedbacks;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<ArchivesProject> getArchives() {
        return archives;
    }

    public void setArchives(Set<ArchivesProject> archives) {
        this.archives = archives;
    }

    public Set<MessageProject> getMessages() {
        return messages;
    }

    public void setMessages(Set<MessageProject> messages) {
        this.messages = messages;
    }

    public Set<FeedBackProject> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(Set<FeedBackProject> feedbacks) {
        this.feedbacks = feedbacks;
    }
    
}
