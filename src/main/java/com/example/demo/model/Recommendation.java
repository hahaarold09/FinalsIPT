package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Harold on 5/30/2018.
 */

public class Recommendation {


    List<String> recommendatoin = new ArrayList<>(Arrays.asList("Sir Bandalan","Sir Magz", "Sir Gene","Maam Cuizon","Maam Petralba"));

    public Recommendation() {
    }

    public Recommendation(List<String> recommendatoin) {
        this.recommendatoin = recommendatoin;
    }

    public List<String> getRecommendatoin() {
        return recommendatoin;
    }

    public void setRecommendatoin(List<String> recommendatoin) {
        this.recommendatoin = recommendatoin;
    }
}
