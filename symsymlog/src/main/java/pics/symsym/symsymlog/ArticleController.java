package pics.symsym.symsymlog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
    
    @GetMapping("/articles/{id}")
    Article one(@PathVariable Long id) {
      
      var article = new Article();
      article.setId(id);
      article.setTitle("Dummy Title");
      return article;
    }
}
