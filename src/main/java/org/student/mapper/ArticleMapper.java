package org.student.mapper;

import org.apache.ibatis.annotations.*;
import org.student.domain.Article;

import java.util.List;

@Mapper
public interface ArticleMapper {

    @Select("SELECT\n" +
            "      id,\n" +
            "      title,\n" +
            "      last_update,\n" +
            "      author_id_fk,\n" +
            "      article_topic_id_fk,\n" +
            "      content\n" +
            "FROM article")
    @Results(value = {
            @Result(property = "lastUpdate", column = "last_update"),
            @Result(property = "author", column = "author_id_fk", one = @One(select = AuthorMapper.GET_AUTHOR)),
            @Result(property = "articleTopic", column = "article_topic_id_fk", one = @One(select = ArticleTopicMapper.GET_ARTICLE_TOPIC))
    })
    List<Article> getArticles();

    @Select("SELECT\n" +
            "      id,\n" +
            "      title,\n" +
            "      last_update,\n" +
            "      author_id_fk,\n" +
            "      article_topic_id_fk,\n" +
            "      content\n" +
            "FROM article\n" +
            "   WHERE id=#{id}")
    @Results(value = {
            @Result(property = "lastUpdate", column = "last_update"),
            @Result(property = "author", column = "author_id_fk", one = @One(select = AuthorMapper.GET_AUTHOR)),
            @Result(property = "articleTopic", column = "article_topic_id_fk", one = @One(select = ArticleTopicMapper.GET_ARTICLE_TOPIC))
    })
    Article getArticleById(Integer id);

    @Insert("INSERT INTO article(title, last_update, author_id_fk, article_topic_id_fk, content)" +
            " VALUES(#{title}, #{lastUpdate}, #{author.id}, #{articleTopic.id}, #{content})")
    void createArticle(Article article);

    @Delete("DELETE FROM article WHERE id=#{id}")
    void deleteArticle(Integer id);

    @Update("UPDATE article SET title=#{title}, lastUpdate=#{lastUpdate}, author_id_fk=#{author.id}, " +
            "article_topic_id_fk=#{articleTopic.id}, content=#{content}  " +
            "WHERE id=#{id}")
    void updateArticle(Article article);

}
