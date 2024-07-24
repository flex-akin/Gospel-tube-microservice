package com.gospeltube.videos.repository;

import com.gospeltube.videos.entity.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, Long> {
}
