package com.synisys.design_patterns.template;

import com.synisys.design_patterns.template.enums.Meal;
import com.synisys.design_patterns.template.enums.Outwear;
import com.synisys.design_patterns.template.enums.Transport;

import java.util.List;

/**
 * Created by haykanush.torchyan on 4/17/2015.
 */
public class FireFighter extends Man {

    @Override
    public void getUp(){
        setWear(Outwear.FIRE_FIGHTER_OUTWEAR);
    }

    @Override
    public void lunchBreak() {
        getMeals().add(Meal.PILAU);
    }

    @Override
    protected void chooseTransport() {
        setTransport(Transport.BUS);
    }

    @Override
    protected void work() {
        // Manage with fire
    }
}
