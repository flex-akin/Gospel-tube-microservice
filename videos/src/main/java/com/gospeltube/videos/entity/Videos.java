package com.gospeltube.videos.entity;

import com.gospeltube.videos.enums.Visibility;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "videos")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Videos extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String callId;
    @Enumerated(EnumType.STRING)
    private Visibility visibility;
    private String tags;
    @Column(columnDefinition = "boolean default false")
    private boolean comment;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime time;
    @Column(columnDefinition = "boolean default false")
    private boolean live;
    @Column(columnDefinition = "boolean default false")
    private boolean liveNow;
    @Column(length = 1000)
    private String videoUrl;
    private String thumbnail;
    @Column(name = "total_likes", columnDefinition = "bigint default 0")
    private Long totalLikes = 0L;
    @Column(name = "total_comments", columnDefinition = "bigint default 0")
    private Long totalComments = 0L;
    @Column(name = "views", columnDefinition = "bigint default 0")
    private Long views = 0L;
    @ManyToOne
    @JoinColumn(name = "series_id")
    private Series series;
}
