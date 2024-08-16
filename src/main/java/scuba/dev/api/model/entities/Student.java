package scuba.dev.api.model.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @SequenceGenerator(name = "student_id_seq")
        @Column
        private Long id;

//        @ManyToOne
//        @JoinColumn(name = "class_id")
//        private Class class;

        @Column(nullable = false)
         private String email;

        @Column(nullable = false)
        private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }



}
