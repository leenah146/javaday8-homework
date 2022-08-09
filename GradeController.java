package com.example.SpringBootDemo1.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class GradeController {
    ArrayList<String> Grades=new ArrayList<>();

    @GetMapping("/Grade")
    public ArrayList GetGrades(){
        return Grades;
    }
    @PostMapping("/Grade")
    public String addGrades(@RequestBody String Grade){
        Grades.add(Grade);
        return "Grade added to the list";
    }

    @PutMapping("/Grade/{index}")
    public String UpdateGrades(@PathVariable int index,@RequestBody String Grade){
        Grades.set(index,Grade);
        return "Grade updated";
    }

    @DeleteMapping("/Grade/{index}")
    public String DeleteGrades(@PathVariable int index){
        Grades.remove(index);
        return "Grade removed";
    }

}
