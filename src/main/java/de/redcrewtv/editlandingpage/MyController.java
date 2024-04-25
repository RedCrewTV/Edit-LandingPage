package de.redcrewtv.editlandingpage;

import de.redcrewtv.editlandingpage.dto.TextDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * This file is a JavaDoc!
 * Created: 4/25/2024
 *
 * @author RedCrew
 * Discord: RedCrew#0100
 * Website: https://redcrewtv.de/
 */
@Controller
public class MyController {

    /*registry.addViewController("/login").setViewName("login");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/error").setViewName("index");
        registry.addViewController("/admin").setViewName("admin-page");*/

    @RequestMapping("/")
    public String index(Model model) {
        model.addAllAttributes(Map.of("title", EditLandingPageApplication.TITLE.replaceAll("\n", "<br>")));
        model.addAllAttributes(Map.of("boxtext", EditLandingPageApplication.TEXT));
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/admin")
    public String admin(Model model) {
        TextDTO dto = new TextDTO();
        dto.setTitle(EditLandingPageApplication.TITLE.replaceAll("\n", "<br>"));
        dto.setText(EditLandingPageApplication.TEXT);
        model.addAllAttributes(Map.of("textDTO", dto));
        return "admin-page";
    }

    @PostMapping("/title")
    public String changeTitle(@ModelAttribute TextDTO textDTO, Model model)   {
        EditLandingPageApplication.TITLE = textDTO.getTitle().replaceAll("<br>", "\n");
        TextDTO dto = new TextDTO();
        dto.setTitle(EditLandingPageApplication.TITLE.replaceAll("\n", "<br>"));
        dto.setText(EditLandingPageApplication.TEXT);
        model.addAllAttributes(Map.of("textDTO", dto));
        return "admin-page";
    }

    @PostMapping("/text")
    public String changeText(@ModelAttribute TextDTO textDTO, Model model)   {
        EditLandingPageApplication.TEXT = textDTO.getText();
        TextDTO dto = new TextDTO();
        dto.setTitle(EditLandingPageApplication.TITLE.replaceAll("\n", "<br>"));
        dto.setText(EditLandingPageApplication.TEXT);
        model.addAllAttributes(Map.of("textDTO", dto));
        return "admin-page";
    }
}
