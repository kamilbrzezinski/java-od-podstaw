package pl.programujodpodstaw.springwebjpa;

import jakarta.persistence.*;

@Entity
public class Post {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

    private String body;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Post() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
