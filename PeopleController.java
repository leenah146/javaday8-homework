package com.example.SpringBootDemo1.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PeopleController {
    ArrayList<String> names=new ArrayList<>();

    @GetMapping("/name")
    public ArrayList GetNames(){
        return names;
    }
    @PostMapping("/name")
    public String addname(@RequestBody String name){
        names.add(name);
        return "name added to the list";
    }

    @PutMapping("/name/{index}")
    public String UpdateNames(@PathVariable int index,@RequestBody String name){
        names.set(index,name);
        return "name updated";
    }

    @DeleteMapping("/name/{index}")
    public String DeleteNames(@PathVariable int index){
        names.remove(index);
        return "name removed";
    }



}
