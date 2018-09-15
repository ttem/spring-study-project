package org.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.student.domain.Article;
import org.student.service.ArticleService;
import org.student.service.ArticleTopicService;
import org.student.service.AuthorService;

@Controller
public class ArticlesController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private AuthorService authorService;

    @Autowired
    private ArticleTopicService articleTopicService;

    @GetMapping("/articles")
    public String getArticlesList(Model model) {
        model.addAttribute("articles", articleService.getArticleList());
        return "articles";
    }

    @GetMapping("/articles/add_article")
    public String createEmptyArticle(Model model) {
        model.addAttribute("article", new Article());
        model.addAttribute("authors", authorService.getAllAuthors());
        model.addAttribute("articleTopics", articleTopicService.getAllArticleTopics());
        return "add_article";
    }

    @PostMapping("/articles/add_article")
    public String createArticle(@ModelAttribute Article article) {
        articleService.createArticle(article);
        return "redirect:/articles";
    }

    @RequestMapping("/articles/see")
    public String seeArticle(Model model, @RequestParam("id") int id) {
        model.addAttribute("article", articleService.getArticleById(id));
        return "article";
    }

    @RequestMapping("/articles/delete")
    public String deleteArticle(@RequestParam("id") int id) {
        articleService.deleteArticle(id);
        return "redirect:/articles";
    }

    @RequestMapping("/articles/edit")
    public String editArticlePage(Model model, @RequestParam("id") int id){
        model.addAttribute("article",articleService.getArticleById(id));
        model.addAttribute("authors", authorService.getAllAuthors());
        model.addAttribute("articleTopics", articleTopicService.getAllArticleTopics());
        return "edit_article";
    }

    @PostMapping("/articles/edit")
    public String updateArticle(@ModelAttribute Article article){
        articleService.updateArticle(article);
        return "redirect:/articles";
    }
}
