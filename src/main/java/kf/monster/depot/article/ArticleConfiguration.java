package kf.monster.depot.article;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArticleConfiguration
{
    @Bean
    public ArticlePriceCounter articlePriceCounter()
    {
        return new ArticlePriceCounter();
    }

    @Bean
    public ArticleSearcher articleSearcher()
    {
        return new ArticleSearcher();
    }
}
