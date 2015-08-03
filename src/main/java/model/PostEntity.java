package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * Created by 24digital on 7/26/15.
 */
@Entity
public class PostEntity {
    @GeneratedValue
    private int id;
    private String topic;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostEntity post = (PostEntity) o;

        if (!topic.equals(post.topic)) return false;
        return description.equals(post.description);

    }

    @Override
    public int hashCode() {
        int result = topic.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }
}
