package engine;

import model.BlogRepository;
import model.Post;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 24digital on 7/27/15.
 */
@Repository
public class JPAHome implements BlogRepository{

    List<Post> postList = new LinkedList<Post>();
    public List<Post> findPost(String name) {

            Post post = new Post();
            post.setDescription("Test");
            post.setTopic(name);
            postList.add(post);

        return postList;
    }


}
