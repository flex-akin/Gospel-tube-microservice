package com.gospeltube.videos.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gospeltube.videos.enums.Visibility;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "series")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Series extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String tags;
    private String language;
    @Enumerated(EnumType.STRING)
    private Visibility visibility;
    @JsonIgnore
    @OneToMany(mappedBy = "series")
    private Set<Videos> videos;
}
