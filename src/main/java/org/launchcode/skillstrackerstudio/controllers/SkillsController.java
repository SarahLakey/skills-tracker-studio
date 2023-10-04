package org.launchcode.skillstrackerstudio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String skillsTracker(){
        return "<h1>Skills Tracker</h1>\n" +
                "<h2>We have a few skills we would like to learn. Here is a list: </h2>\n" +
                "<ol>\n" +
                "    <li>Java</li>\n" +
                "    <li>JavaScript</li>\n" +
                "    <li>Python</li>\n" +
                "</ol>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String skillsForm(){
        return "<form method ='post'>\n" +
                "    Name: <br>\n" +
                "    <input type = 'text' name = 'name' />\n" +
                "    <br>My favorite language:<br>\n" +
                "    <select name = 'firstChoice'>\n" +
                "        <option value ='Java'>Java</option>\n" +
                "        <option value ='JavaScript'>JavaScript</option>\n" +
                "        <option value ='Python'>Python</option>\n" +
                "    </select>\n" +
                "    <br>My second favorite language:<br>\n" +
                "    <select name = 'secondChoice'>\n" +
                "        <option value ='Java'>Java</option>\n" +
                "        <option value ='JavaScript'>JavaScript</option>\n" +
                "        <option value ='Python'>Python</option>\n" +
                "    </select>\n" +
                "    <br>My third favorite language:<br>\n" +
                "    <select name = 'thirdChoice'>\n" +
                "        <option value ='Java'>Java</option>\n" +
                "        <option value ='JavaScript'>JavaScript</option>\n" +
                "        <option value ='Python'>Python</option>\n" +
                "    </select>\n" +
                "    <input type = 'submit' value = 'Submit'/>\n" +
                "</form>";
    }
    @PostMapping("/form")
    @ResponseBody
    public String handleForm(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice){
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice  + "</li>" +
                "<li>" + secondChoice  + "</li>" +
                "<li>" + thirdChoice  + "</li>"
                + "</ol>";
    }

}
