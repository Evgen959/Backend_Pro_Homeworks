package app.repository;

import app.model.Car;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryHibernate implements CarRepository{

    private EntityManager entityManager;

    public CarRepositoryHibernate() {

        entityManager = new Configuration()
                .configure("hibernate/postgres.cfg.xml")
                .buildSessionFactory().createEntityManager();
    }

    @Override
    public List<Car> getAll() {
        // TODO Д\З
        List<Car> cars = new ArrayList<>();

        for (int i = 1; i < 8; i++) {
            cars.add(entityManager.find(Car.class, i));
        }

        return cars;
    }

    @Override
    public Car save(Car car) {
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(car);
            transaction.commit();
        } catch (Exception e) {
            // проверяем открыта ли еще транзакция
            if (transaction.isActive()){
                // откатываем транзакцию вручную для более быстрого освобождения ресурсов
                transaction.rollback();
            }
        }


        return car;
    }

    @Override
    public Car findById(long id) {
        return entityManager.find(Car.class, id);
    }

    @Override
    public Car update(Car car) {
        // TODO Д\З
        return null;
    }

    @Override
    public void delete(Car car) {
        // TODO Д\З
    }
}
