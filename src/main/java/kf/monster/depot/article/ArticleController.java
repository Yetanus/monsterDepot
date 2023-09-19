package kf.monster.depot.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController
{
    @Autowired
    ArticleService articleService;

    @GetMapping("article")
    public Article getArticle()
    {
        return articleService.articleRepository.getArticle(1);
    }
}
