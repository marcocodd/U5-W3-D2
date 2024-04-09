package marco.U5W3D2.controllers;


import marco.U5W3D2.entities.BlogPost;
import marco.U5W3D2.services.BlogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogController {
    @Autowired
    private BlogsService blogsService;

    @GetMapping
    private List<BlogPost> getAllBlogs() {
        return this.blogsService.getBlogsList();
    }

    @GetMapping("/{id}")
    private BlogPost findBlogById(@PathVariable int id) {
        return this.blogsService.findBlogById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private BlogPost saveBlogPost(@RequestBody BlogPost body) {
        return this.blogsService.saveBlogPost(body);
    }

    @PutMapping("/{id}")
    private BlogPost findByIdAndUpdate(@PathVariable int id, @RequestBody BlogPost body) {
        return this.blogsService.findByIdAndUpdate(id, body);
    }
}
