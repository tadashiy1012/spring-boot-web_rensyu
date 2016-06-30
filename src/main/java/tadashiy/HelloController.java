package tadashiy;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/hello")
public class HelloController {
  @RequestMapping(method=RequestMethod.GET)
  public String hello() {
    return "Hello Spring!!";
  }
  @RequestMapping(method=RequestMethod.POST)
  public Hoge hello(@RequestBody Hoge param) {
    System.out.println(param);
    Hoge hoge = new Hoge();
    hoge.id = 20;
    hoge.value = "Response";
    return hoge;
  }
  @RequestMapping(value="/hoge", method=RequestMethod.GET)
  public String hoge(@RequestParam String param) {
    return param;
  }
  @RequestMapping(value="/calc/{a}/{b}", method=RequestMethod.GET)
  public String calc(@PathVariable int a, @PathVariable int b) {
    return a + " + " + b + " = " + (a + b);
  }
  @RequestMapping(value="/bad", method=RequestMethod.GET)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public void bad() {}
}