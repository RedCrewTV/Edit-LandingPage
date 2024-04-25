package de.redcrewtv.editlandingpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EditLandingPageApplication {

    public static String TITLE = "¿Which one \nfits you most \nToday?";
    public static String TEXT = "Lorem ipsum dolor sit amet consectetur, adipisicing elit. \n" +
            "Iste porro doloribus itaque, error quasi alias eum deleniti culpa recusandae velit.\n" +
            "Omnis ipsa repellendus maiores libero reiciendis culpa possimus illo dolorem! Ex aliquid\n" +
            "fugit harum ullam odio ea quas quae placeat iure saepe incidunt, eligendi nemo voluptatum \n" +
            "quidem odit illum nam iusto nesciunt ipsum doloribus consequuntur sunt. Beatae enim eveniet at! \n" +
            "Lorem ipsum, dolor sit amet consectetur adipisicing elit.";

    public static void main(String[] args) {
        SpringApplication.run(EditLandingPageApplication.class, args);
    }

}
