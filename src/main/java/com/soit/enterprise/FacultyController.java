package com.soit.enterprise;


import com.soit.enterprise.model.Faculty;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/Faculties")
public class FacultyController {
    //upload faculty info
    private List<Faculty> theFaculties;

    @PostConstruct
    private void loadData(){

        //Create Faculties
        Faculty fac1 = new Faculty(1, "Kelly", "Miller", "Assistant Professor","Kelly@uc.edu");
        Faculty fac2 = new Faculty(1, "Robert", "Lee", "Instructor Educator","Robert@uc.edu");
        Faculty fac3 = new Faculty(1, "Laura", "West", "Adjunct Professor","Laura@uc.edu");

        //Create our List
        theFaculties = new ArrayList<>();

        //Add to our List
        theFaculties.add(fac1);
        theFaculties.add(fac2);
        theFaculties.add(fac3);

    }

    //mapping for "List"
    @GetMapping("/list")
    public String listFaculties(Model theModel){
        //add faculties to model
        theModel.addAttribute("faculties", theFaculties);

        return "list-faculties";
    }


}
