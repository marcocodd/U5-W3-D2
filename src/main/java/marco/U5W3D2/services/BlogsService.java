package marco.U5W3D2.services;

import marco.U5W3D2.entities.BlogPost;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class BlogsService {
    private List<BlogPost> blogsList = new ArrayList<>();

    public List<BlogPost> getBlogsList() {
        return this.blogsList;
    }

    public BlogPost saveBlogPost(BlogPost body) {
        Random rndm = new Random();
        body.setId(rndm.nextInt(1, 10000));
        body.setCover("https://placebear.com/200/300");
        this.blogsList.add(body);
        return body;
    }

    public BlogPost findBlogById(int id) {
        BlogPost blogFound = null;
        for (BlogPost blog : this.blogsList) {
            if (blog.getId() == id) ;
            blogFound = blog;
        }
        return blogFound;
    }

    public BlogPost findByIdAndUpdate(int id, BlogPost updateBlogPost) {
        BlogPost postFound = null;
        for (BlogPost blogPost : this.blogsList) {
            if (blogPost.getId() == id) {
                postFound = blogPost;
                postFound.setContenuto(updateBlogPost.getContenuto());
            }
        }
        return postFound;
    }

    public void findByIdAndDelete(int id) {
        Iterator<BlogPost> iterator = this.blogsList.iterator();
        while (iterator.hasNext()) {
            BlogPost current = iterator.next();
            if (current.getId() == id) {
                iterator.remove();
            }
        }
    }
}
