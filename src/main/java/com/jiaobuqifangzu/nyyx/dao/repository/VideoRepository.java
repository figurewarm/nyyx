package com.jiaobuqifangzu.nyyx.dao.repository;


import com.jiaobuqifangzu.nyyx.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author ChenXing
 * @date 2020/10/12 13:54
 */
public interface VideoRepository extends JpaRepository<Video, Integer>, JpaSpecificationExecutor<Video> {

//    public List<Video> findvideosByvideoId(Integer id);
}
