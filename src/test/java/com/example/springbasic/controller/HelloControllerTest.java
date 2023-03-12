package com.example.springbasic.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

//    @Test
//    @DisplayName("hello-api")
//    void getBoard() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/hello-api")
////                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
//                                .contentType(MediaType.APPLICATION_JSON)
////                        .param("title", "업데이트 공지")
//                        .param("name", "name test!")
////                                .content("{\"name\": \"name입니다.\"}")
//                )
//                .andExpect(status().isOk())
//                .andExpect(content().string("getBoard"))
//                .andDo(MockMvcResultHandlers.print());
//    }
//
//    @Test
//    @DisplayName("hello-mvc.")
//    void getBoard2() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/hello-mvc")
////                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
//                                .contentType(MediaType.APPLICATION_JSON)
////                        .param("title", "업데이트 공지")
//                                .param("name", "name test!")
////                                .content("{\"name\": \"name입니다.\"}")
//                )
//                .andExpect(status().isOk())
//                .andExpect(content().string("getBoard"))
//                .andDo(MockMvcResultHandlers.print());
//    }
}