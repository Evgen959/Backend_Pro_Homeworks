package app.repository;

import app.domain.Goods;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Repository
@PropertySource("classpath:application.properties")
public class GoodsRepositoryMap implements GoodsRepository{
    private final Map<Long, Goods> database;

    public GoodsRepositoryMap(@Value() Map<Long, Goods> database) {
        this.database = database;
        initData();
    }

    private void initData(){
        database.put(1L, new Goods(1L, "Hammer", new BigDecimal(6)));
        database.put(2L, new Goods(2L, "Screwdriver", new BigDecimal(8)));
        database.put(3L, new Goods(3L, "Pliers", new BigDecimal(13)));
    }

    @Override
    public Goods getGoodsById(long id) {
        return database.get(id);
    }
}
