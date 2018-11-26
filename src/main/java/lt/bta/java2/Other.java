package lt.bta.java2;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Other {

    @RequestMapping(path = "/person", method = RequestMethod.GET)
    public String person(Model model) {
        Map<String, String> map = new HashMap<>();
        map.put("msg", "unknown!");
        model.addAllAttributes(map);
        return "person";
    }

    @RequestMapping(
            path = "/person/json",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Map<String, Object> personJson() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Jonas");
        map.put("visible", true);
        map.put("pi", Math.PI);
        return map;
    }
}
