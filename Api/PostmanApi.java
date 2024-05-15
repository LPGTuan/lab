package com.poly.demo01.Api;


import com.poly.demo01.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class PostmanApi {
    @GetMapping("/getStudentInformation")
    public ResponseEntity<?> dogetStudentInformation(Student student) {
        Map<String, Object> result = new HashMap<>();
        result.put("message","Call api success");
        result.put("Status",true);
        result.put("data", student);

        return ResponseEntity.ok(result);
    }
//    @GetMapping("/getStudentInformation")
//    public ResponseEntity<?> dopostStudentInformation(@RequestBody Student student) {
//        Map<String, Object> result = new HashMap<>();
//        result.put("message","Call api success");
//        result.put("Status",true);
//        result.put("data", student);
//
//        return ResponseEntity.ok(result);
//    }
}
