package com.block.details.controller;

import com.block.details.model.BuildingInfo;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/blockAPI")
public class blockAPI {

    HashMap<Integer,BuildingInfo> hm = new HashMap<Integer, BuildingInfo>();

    @GetMapping("/all")
    public HashMap<Integer,BuildingInfo> getAllDetails(){
        return hm;
    }

    @GetMapping("/{id}")
    public String getDetails(@PathVariable Integer id){
        BuildingInfo data = hm.get(id);
        return "Building info :- building no. => "+ data.getBuildingNo()+" name => "+data.getName();
    }

    @PostMapping
    public String insertDetails(@RequestBody BuildingInfo data){
        hm.put(hm.size()+1,data);

        return "data inserted";
    }

    @PutMapping("/{id}")
    public String updateData(@PathVariable Integer id, @RequestBody BuildingInfo data){
       hm.put(id,data);
       return "updates done";

    }

    @DeleteMapping("/all")
    public String deleteALlDetails(){
        hm.clear();
        return "hashmap empty";
    }

    @DeleteMapping("/{id}")
    public String deleteParticular(@PathVariable Integer id){
        hm.remove(id);
        return "entry deleted";
    }
}
