package app.service;

import app.domain.Goods;
import app.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class GoodsServiceImpl implements GoodsService{

    private  String articlePrefix;
    private final GoodsRepository repository;

    public GoodsServiceImpl( GoodsRepository repository, @Value("${article.prefix}") String articlePrefix) {
        this.repository = repository;
        this.articlePrefix = articlePrefix;
    }

    @Override
    public Goods getById(long id) {
        Goods goods = repository.getGoodsById(id);
        setArticle(goods);
        return goods;
    }

    private void setArticle(Goods goods){
        // Art-B-2
        String article = String.format("%s-%s-%d", articlePrefix, goods.getTitle().charAt(0), goods.getId());
        goods.setArticle(article);
    }
}
