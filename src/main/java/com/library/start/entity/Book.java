package com.library.start.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", nullable = false, unique = true)
    private int bookId;

    @Type(type = "text")
    @Column(name="vendor_code", length = 10, nullable = false)
    private String vendorCode;

    @Lob
    @Column(name="title", nullable = false)
    private String title;
}
