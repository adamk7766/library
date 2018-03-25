package pl.akademiakodu.library.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.library.model.Author;
import pl.akademiakodu.library.repository.AuthorRepository;

@Controller
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/authors/add")
    public String add(ModelMap modelMap){
        modelMap.put("author",new Author());
        return "authors/add";
    }

    @PostMapping("/authors")
    public String save(@ModelAttribute Author author){
        authorRepository.save(author);
        return "redirect:/authors";
    }


    @GetMapping("/authors")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("authors",authorRepository.findAll());
        return "authors/index";
    }

    @GetMapping("authors/{id}/edit")
    public String edit(@PathVariable Long id,ModelMap modelMap){
        modelMap.put("author",authorRepository.findById(id).get());
        return "authors/add";
    }

    @GetMapping("authors/{id}")
    public String show(@PathVariable Long id, ModelMap modelMap){
        modelMap.put("author",authorRepository.findById(id).get());
        return "authors/show";
    }


    @GetMapping("authors/{id}/delete")
    public String delete(@PathVariable Long id,ModelMap modelMap){
        authorRepository.deleteById(id);
        return "redirect:/authors";
    }

}
