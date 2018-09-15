package org.student.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.student.domain.ArticleTopic;

import java.util.List;

@Mapper
public interface ArticleTopicMapper {

    String GET_ARTICLE_TOPIC = "org.student.mapper.ArticleTopicMapper.getArticleTopic";

    @Select("SELECT id, name FROM article_topic where id=#{id}")
    ArticleTopic getArticleTopic(Integer id);

    @Select("SELECT id, name FROM article_topic ")
    List<ArticleTopic> getAllArticleTopic();
}
