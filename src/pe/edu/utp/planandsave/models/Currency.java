package pe.edu.utp.planandsave.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by usuario on 16/06/2017.
 */
public class Currency {
    private int id;
    private String name;
    private float exchange;

    public int getId() { return id; }

    public String getIdAsString(){
        return String.valueOf(getId());
    }

    public Currency setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }
    public String getNameAsValue(){
        return "'" + getName() + "'";
    }

    public Currency setName(String name) {
        this.name = name;
        return this;
    }

    public float getExchange() {
        return exchange;
    }
    public String getExchangeAsString(){
        return String.valueOf(getExchange());
    }

    public Currency setExchange(float exchange) {
        this.exchange = exchange;
        return this;
    }
    public static Currency bluid(ResultSet resultSet){
        try {
            return (new Currency())
                    .setId(resultSet.getInt("id"))
                    .setName(resultSet.getString("name"))
                    .setExchange(resultSet.getFloat("exchange_rate"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
