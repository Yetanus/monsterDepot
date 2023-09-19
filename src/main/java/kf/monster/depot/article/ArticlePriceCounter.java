package kf.monster.depot.article;

import kf.monster.depot.article.common.Package;

public class ArticlePriceCounter
{

    public void selectPackage(Article article)
    {
        double basePrice = article.getPrice();
        if(article.getMonsterPackage() == Package.CAN)
        {
            basePrice = basePrice * 1.44;
            article.setPrice(basePrice);
        }
        if(article.getMonsterPackage() == Package.BIG_CAN)
        {
            basePrice = basePrice * 1.9;
            article.setPrice(basePrice);
        }
        if (article.getMonsterPackage() == Package.BOTTLE)
        {
            basePrice = basePrice * 1.2;
            article.setPrice(basePrice);
        }
        else throw new RuntimeException("Wrong type of package");

    }

    public void selectTaste(Article article)
    {
        double basePrice = article.getPrice();
        if(article.getTaste().contains("Zero"))
        {
            basePrice = basePrice* 1.5;
            article.setPrice(basePrice);
        }
        if(article.getTaste().contains("Vanilla"))
        {
            basePrice = basePrice* 0.5;
            article.setPrice(basePrice);
        }
    }
}
