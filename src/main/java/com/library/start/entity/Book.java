package com.library.start.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id", nullable = false)
    private int bookId;

    @Column(name="vendor_code", length = 10, nullable = false)
    private String vendorCode;

    @Column(name="title", length = 300, nullable = false)
    private String title;

    @ManyToMany(mappedBy = "book")
    private Set<Author> authors;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
