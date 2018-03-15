package org.saurabhsood.controllers;

import org.saurabhsood.model.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@SessionAttributes("goal")
public class GoalController {

    @RequestMapping(value = "/addGoal", method = RequestMethod.GET)
    public String addGoal(Model model){
        Goal goal= new Goal();
        goal.setMinutes(15);
        model.addAttribute("goal",goal);
        return "addGoal";
    }

    @RequestMapping(value = "/addGoal", method = RequestMethod.POST)
    public String updateGoal(@Valid @ModelAttribute("goal") Goal goal ,BindingResult result){
        System.out.println("Result has errors :"+ result.hasErrors());
        if (result.hasErrors()){
            return "addGoal";
        }
        System.out.println("Minutes updated : "+goal.getMinutes());
        return "redirect:addMinutes.html";
    }
}
