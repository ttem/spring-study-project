package org.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.domain.ArticleTopic;
import org.student.mapper.ArticleTopicMapper;

import java.util.List;

@Service
public class ArticleTopicService {

    @Autowired
    ArticleTopicMapper articleTopicMapper;

    public List<ArticleTopic> getAllArticleTopics() {
        return articleTopicMapper.getAllArticleTopic();
    }
}
