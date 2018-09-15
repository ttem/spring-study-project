package org.student.job;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.student.service.ArticleService;

@Component
public class StatisticJob {

    Logger logger = Logger.getLogger(StatisticJob.class);

    @Autowired
    private ArticleService articleService;

    @Scheduled(fixedRate = 15000)
    public void logArticlesCount() {
        logger.info("Articles count:" + articleService.getArticlesCount());
    }
}
