package pe.edu.utp.planandsave.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by usuario on 16/06/2017.
 */
public class Share {
    private int id;
    private int number;
    private String payment;
    private float amount;

    public int getId() {
        return id;
    }
    public String getIdAsString(){
        return String.valueOf(getId());
    }

    public Share setId(int id) {
        this.id = id;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public String getNumberAsValue(){return String.valueOf(getNumber());
    }

    public Share setNumber(int number) {
        this.number = number;
        return this;
    }

    public String getPayment() {
        return payment;
    }

    public String getPaymentAsString(){
        return "'" + getNumber() + "'";
    }

    public Share setPayment(String payment) {
        this.payment = payment;
        return this;
    }

    public float getAmount() {
        return amount;
    }
    public String getAmountAsString(){
        return String.valueOf(getAmount());
    }

    public Share setAmount(float amount) {
        this.amount = amount;
        return this;
    }
    public static Share bluid(ResultSet resultSet){
        try {
            return (new Share())
                    .setId(resultSet.getInt("id"))
                    .setNumber(resultSet.getInt("number"))
                    .setPayment(resultSet.getString("payment_date"))
                    .setAmount(resultSet.getFloat("amount"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

