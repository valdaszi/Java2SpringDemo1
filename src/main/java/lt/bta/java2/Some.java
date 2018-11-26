package lt.bta.java2;

import lt.bta.java2.beans.Thing;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@RestController
@RequestMapping("/some")
public class Some {

    @GetMapping("/{id}")
    public Thing getThing(@PathVariable int id, @RequestParam(value = "name", required = false) String name) {
        Thing thing = new Thing();

        thing.setId(id);
        thing.setName(name != null ? name : "Jonas");
        thing.setNumber(1234.56789);

        thing.setOld(new Date());
        thing.setDate(LocalDate.now());
        thing.setTime(LocalDateTime.now());

        return thing;
    }
}
