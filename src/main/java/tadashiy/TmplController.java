package tadashiy;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tmpl")
public class TmplController {
  @RequestMapping(method=RequestMethod.GET)
  public String index(Model model) {
    List<Hoge> list = Arrays.asList(
      new Hoge() {{
        id = 100;
        value = "hogehoge";
      }},
      new Hoge() {{
        id = 200;
        value = "fugafuga";
      }}
    );
    model.addAttribute("data", list);
    return "index";
  }
}