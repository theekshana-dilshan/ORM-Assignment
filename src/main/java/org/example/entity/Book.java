package org.example.entity;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private Integer publicationYear;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "author_id",nullable = false)
    private Author author;
}
