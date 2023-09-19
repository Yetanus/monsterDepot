package kf.monster.depot.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Map;

@RequiredArgsConstructor
@Repository
public class ArticleRepository {

    private Map<Long, Article> repository;
    public Article getArticle(long id)
    {
        return repository.get(id);
    }

    public void addArticle(Article article)
    {
        repository.put(article.getId(), article);
    }

    public Article deleteArticle(long id)
    {
        Article article = repository.get(id);
        this.repository.remove(id);
        return article;
    }
}
