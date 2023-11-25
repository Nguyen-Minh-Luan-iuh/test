package fit.se.demo1.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "experience")
class Experience {
    @Id
    @Column(name = "exp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private Roles roles;
    @ManyToOne
    @JoinColumn(name = "can_id")
    @JsonIgnore
    private Candidate candidate;

    public Experience(long id, Roles roles, Candidate candidate) {
        this.id = id;
        this.roles = roles;
        this.candidate = candidate;
    }

    public Experience() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", roles=" + roles +
                ", candidate=" + candidate +
                '}';
    }
}
