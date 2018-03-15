package org.saurabhsood.controllers;

import org.saurabhsood.model.Activity;
import org.saurabhsood.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute ("exercise")Exercise exercise){
        System.out.println(exercise.getMinutes());
        return "addMinutes";
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody List<Activity> getAllActivities(@ModelAttribute ("activity")Activity activity){
        List activities = new ArrayList();
        Activity run = new Activity();
        run.setDesc("run");
        activities.add(run);

        Activity swim = new Activity();
        run.setDesc("swim");
        activities.add(swim);

        Activity bike = new Activity();
        run.setDesc("bike");
        activities.add(bike);

        return  activities;
    }
}
