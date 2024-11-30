/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.Model.Productos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author LAB_P03
 */
@Controller
public class Controlador {

    //muestra el formulrio
    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("product", new Productos());
        return "register";
    }

    @PostMapping("/register")
    public String registerProduct(@ModelAttribute Productos product, Model model) {
        model.addAttribute("product", product);
        return "success";
    }

}
