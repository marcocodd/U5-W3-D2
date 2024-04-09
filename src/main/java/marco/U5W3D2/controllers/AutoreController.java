package marco.U5W3D2.controllers;

import marco.U5W3D2.entities.Autore;
import marco.U5W3D2.services.AutoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/autori")
public class AutoreController {
    @Autowired
    private AutoriService autoriService;

    @GetMapping
    private List<Autore> getAllBlogs() {
        return this.autoriService.getAutoriList();
    }

}
