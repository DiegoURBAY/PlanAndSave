package pe.edu.utp.planandsave.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by usuario on 16/06/2017.
 */
public class Goal {
    private int id;
    private String name;
    private String progress;
    private String image;
    private float cost;

    public int getId() {
        return id;
    }
    public String getIdAsString(){
        return String.valueOf(getId());
    }

    public Goal setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }
    public String getNameAsValue(){
        return "'" + getName() + "'";
    }

    public Goal setName(String name) {
        this.name = name;
        return this;
    }

    public String getProgress() {
        return progress;
    }
    public String getProgressAsValue(){
        return "'" + getProgress() + "'";
    }

    public Goal setProgress(String progress) {
        this.progress = progress;
        return this;
    }

    public String getImage() {
        return image;
    }
    public String getImageAsValue(){ return "'" + getImage() + "'";}

    public Goal setImage(String image) {
        this.image = image;
        return this;
    }

    public float getCost() {
        return cost;
    }
    public String getCostAsString(){ return String.valueOf(getCost());
    }

    public Goal setCost(float cost) {
        this.cost = cost;
        return this;
    }
    public static Goal bluid(ResultSet resultSet){
        try {
            return (new Goal())
                    .setId(resultSet.getInt("id"))
                    .setName(resultSet.getString("name"))
                    .setProgress(resultSet.getString("progress"))
                    .setImage(resultSet.getString("image"))
                    .setCost(resultSet.getFloat("cost"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
