package com.soul.blog.infrastructrue.dao;

import com.soul.blog.domain.model.entry.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sould on 2016-02-29.
 */
public interface HelloDao extends JpaRepository<Hello, Integer> {
}
