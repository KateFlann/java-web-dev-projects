package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

//    You need to have an h1 with the title “Skills Tracker”,
//    an h2, and an ol containing three programming languages
//    of your choosing.

    public String helloForm() {


        String html =
                "<html>" +
                        "<body>" +
                        "<h1>" +
                        "Skills Tracker" +
                        "</h1>" +
                        "<ol>" +
                        "<li>" +
                        "" +
                        "</li>" +
                        "<li>" +
                        "" +
                        "</li>" +
                        "<li>" +
                        "" +
                        "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;

        @GetMapping("form")
        public String helloForm(){
            return "<html>" +
                    "<body>" +
                    "<form action='hello' method='post'>" + //submits a request to /hello
                    "<input type='text' name='name'>" +
                    "<input type='submit' value='Greet Me!'>" +
                    "</form>" +
                    "</body>" +
                    "</html>";
        }
}
