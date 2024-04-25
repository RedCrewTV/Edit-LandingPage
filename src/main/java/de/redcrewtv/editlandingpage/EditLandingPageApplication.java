package de.redcrewtv.editlandingpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EditLandingPageApplication {

    public static String TITLE = "¿Which one \nfits you most \nToday?";
    public static String TEXT = "Lorem ipsum dolor sit amet consectetur, adipisicing elit. " +
            "Iste porro doloribus itaque, error quasi alias eum deleniti culpa recusandae velit.  " +
            "Omnis ipsa repellendus maiores libero reiciendis culpa possimus illo dolorem! Ex aliquid" +
            "fugit harum ullam odio ea quas quae placeat iure saepe incidunt, eligendi nemo voluptatum " +
            "quidem odit illum nam iusto nesciunt ipsum doloribus consequuntur sunt. Beatae enim eveniet at! " +
            "Lorem ipsum, dolor sit amet consectetur adipisicing elit.";

    public static void main(String[] args) {
        SpringApplication.run(EditLandingPageApplication.class, args);
    }

}
