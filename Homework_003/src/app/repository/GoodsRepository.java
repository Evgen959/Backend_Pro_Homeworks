package app.repository;

import app.domain.Goods;
public interface GoodsRepository {
    Goods getGoodsById(long id);
}
