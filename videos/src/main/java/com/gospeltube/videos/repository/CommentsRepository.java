package com.gospeltube.videos.repository;

import com.gospeltube.videos.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Long, Comments> {
}
