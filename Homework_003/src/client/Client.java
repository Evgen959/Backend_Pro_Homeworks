package client;

import app.controller.GoodsController;
import app.domain.Goods;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app");

        GoodsController controller = context.getBean(GoodsController.class);

        Goods goods = controller.getGoodsById(2);

        System.out.println(goods);
    }
}
