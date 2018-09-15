package org.student.mapper;

import org.apache.ibatis.annotations.*;
import org.student.domain.Article;
import org.student.domain.ArticleTopic;
import org.student.domain.Author;
import org.student.domain.City;

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
            @Result(property = "author", column = "author_id_fk", one = @One(select = "getAuthor")),
            @Result(property = "articleTopic", column = "article_topic_id_fk", one = @One(select = "getArticleTopic"))
    })
    List<Article> getArticles();

    @Select("SELECT id, surname, city_id_fk FROM author where id=#{id}")
    @Results(value = {
            @Result(property = "city", column = "city_id_fk", one = @One(select = "getCity"))
    })
    Author getAuthor(Integer id);

    @Select("SELECT id, name FROM city where id=#{id}")
    City getCity(Integer id);

    @Select("SELECT id, name FROM article_topic where id=#{id}")
    ArticleTopic getArticleTopic(Integer id);

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
