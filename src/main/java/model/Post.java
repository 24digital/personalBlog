package model;

/**
 * Created by 24digital on 7/26/15.
 */
public class Post {
    private String topic;
    private String description;

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

        Post post = (Post) o;

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
