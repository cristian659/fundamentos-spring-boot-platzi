package com.fundamentosplatzi.springboot.fundamentos.entity;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//para que se genere un id unico
    @Column(name = "id_post", nullable = false, unique = true)//nombre puntual,no null, valor unico para que no se guarde otro valor igual a ese
    private long id;
    @Column(name = "description", length = 255)
   private long description;

    @ManyToOne
    private User user;

    public Post() {
    }

    public Post(long description, User user) {
        this.description = description;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDescription() {
        return description;
    }

    public void setDescription(long description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description=" + description +
                ", user=" + user +
                '}';
    }
}
