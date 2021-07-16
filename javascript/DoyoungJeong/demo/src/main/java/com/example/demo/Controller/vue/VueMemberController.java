package com.example.demo.controller.vue;

import com.example.demo.entity.Member;
import com.example.demo.service.VueMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/vuemember")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")

public class VueMemberController {

    @Autowired
    private VueMemberService service;

    @PostMapping("/signup")
    public ResponseEntity<Member> signup(@Validated @RequestBody Member member) throws Exception {
        //@RequestBody은 값을 JSON형태로 출력되게한다.

        log.info("post signup request from vue");

        service.register(member);

        return new ResponseEntity<>(member, HttpStatus.OK);
    }
}
