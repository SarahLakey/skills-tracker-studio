package org.launchcode.skillstrackerstudio;

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
                "<h2>Programming Languages</h2>\n" +
                "<ol>\n" +
                "    <li>JavaScript</li>\n" +
                "    <li>Java</li>\n" +
                "    <li>SQL</li>\n" +
                "</ol>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String skillsForm(){
        return "<form method = 'post' action='/form'>\n" +
                "    <p>\n" +
                "        <label>Name: <br>\n" +
                "            <input type='text' name='name'/>\n" +
                "        </label>\n" +
                "    </p>\n" +
                "    <p>\n" +
                "    <label>My favorite language: </label> <br>\n" +
                "        <select name='firstFav'>\n" +
                "            <option value=\"oneLang\">JavaScript</option>\n" +
                "            <option value=\"secondLang\">Java</option>\n" +
                "            <option value=\"thirdLang\">SQL</option>\n" +
                "        </select>\n" +
                "    </p>\n" +
                "    <p>\n" +
                "        <label>My second favorite language: </label> <br>\n" +
                "        <select name='secondFav'>\n" +
                "            <option value=\"oneLang\">JavaScript</option>\n" +
                "            <option value=\"secondLang\">Java</option>\n" +
                "            <option value=\"thirdLang\">SQL</option>\n" +
                "        </select>\n" +
                "    </p>\n" +
                "    <p>\n" +
                "        <label>My third favorite language: </label> <br>\n" +
                "        <select name='thirdFav'>\n" +
                "            <option value=\"oneLang\">JavaScript</option>\n" +
                "            <option value=\"secondLang\">Java</option>\n" +
                "            <option value=\"thirdLang\">SQL</option>\n" +
                "        </select>\n" +
                "    </p>\n" +
                "    <input type='submit' value='Submit'/>\n" +
                "</form>";
    }
    @PostMapping("/form")
    public String handleForm(@RequestParam String name, String firstFav, String secondFav, String thirdFav){
        return name + "/n1. " + firstFav  + "/n2. " +  secondFav  + "/n3. " +  thirdFav;
    }

}
