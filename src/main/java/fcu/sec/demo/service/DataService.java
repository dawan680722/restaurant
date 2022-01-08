package fcu.sec.demo.service;

import fcu.sec.demo.database.Sql2oDbHandler;
import fcu.sec.demo.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private Sql2oDbHandler sql2oDbHandler;

    public DataService() {

    }

    public List<Data> getDatas() {
        try (Connection connection = sql2oDbHandler.getConnector().open()) {
            String query = "select orderName orderName , restaurantName restaurantName, people people, orderDate orderDate, orderTime orderTime, phone phone"
                    + " from ordercsv";

            return connection.createQuery(query).executeAndFetch(Data.class);
        }
    }
    /**public List<Restaurant> getRestaurantk(String keyword){
        try (Connection connection = sql2oDbHandler.getConnector().open()) {
            String query = "select area area, restaurantName restaurantName, picture picture, priceRange priceRange, restaurantIntroduce restaurantIntroduce, dietType dietType"
                    + " from restaurantcsv where restaurantName like :keyword";

            return connection.createQuery(query)
                    .addParameter("keyword", "%"+keyword+"%")
                    .executeAndFetch(Data.class);
        }
    }

    public List<Data> getRestaurantarea(String areas){
        try (Connection connection = sql2oDbHandler.getConnector().open()) {
            String query = "select area area, restaurantName restaurantName, picture picture, priceRange priceRange, restaurantIntroduce restaurantIntroduce, dietType dietType"
                    + " from ordercsv where area like :areas";

            return connection.createQuery(query)
                    .addParameter("areas","%"+areas+"%")
                    .executeAndFetch(Data.class);
        }
    }

    public List<Restaurant> getRestaurantsort(String sorts){
        try (Connection connection = sql2oDbHandler.getConnector().open()) {
            String query = "select area area, restaurantName restaurantName, picture picture, priceRange priceRange, restaurantIntroduce restaurantIntroduce, dietType dietType"
                    + " from restaurantcsv where dietType like :sorts";

            return connection.createQuery(query)
                    .addParameter("sorts","%"+sorts+"%")
                    .executeAndFetch(Restaurant.class);
        }
    }
    public List<Restaurant> getRestaurantprice1(String prices){
        try (Connection connection = sql2oDbHandler.getConnector().open()) {
            String query = "select area area, restaurantName restaurantName, picture picture, priceRange priceRange, restaurantIntroduce restaurantIntroduce, dietType dietType"
                    + " from restaurantcsv where priceRange between 1 and :prices";

            return connection.createQuery(query)
                    .addParameter("prices",Integer.parseInt(prices))
                    .executeAndFetch(Restaurant.class);
        }
    }
    public List<Restaurant> getRestaurantprice2(String prices){
        try (Connection connection = sql2oDbHandler.getConnector().open()) {
            String query = "select area area, restaurantName restaurantName, picture picture, priceRange priceRange, restaurantIntroduce restaurantIntroduce, dietType dietType"
                    + " from restaurantcsv where priceRange between 200 and :prices";

            return connection.createQuery(query)
                    .addParameter("prices",Integer.parseInt(prices))
                    .executeAndFetch(Restaurant.class);
        }
    }
    public List<Restaurant> getRestaurantprice3(String prices){
        try (Connection connection = sql2oDbHandler.getConnector().open()) {
            String query = "select area area, restaurantName restaurantName, picture picture, priceRange priceRange, restaurantIntroduce restaurantIntroduce, dietType dietType"
                    + " from restaurantcsv where priceRange between 600 and :prices";

            return connection.createQuery(query)
                    .addParameter("prices",Integer.parseInt(prices))
                    .executeAndFetch(Restaurant.class);
        }
    }
    public List<Restaurant> getRestaurantprice4(String prices){
        try (Connection connection = sql2oDbHandler.getConnector().open()) {
            String query = "select area area, restaurantName restaurantName, picture picture, priceRange priceRange, restaurantIntroduce restaurantIntroduce, dietType dietType"
                    + " from restaurantcsv where priceRange between 1000 and :prices";

            return connection.createQuery(query)
                    .addParameter("prices",Integer.parseInt(prices))
                    .executeAndFetch(Restaurant.class);
        }
    }*/

}
