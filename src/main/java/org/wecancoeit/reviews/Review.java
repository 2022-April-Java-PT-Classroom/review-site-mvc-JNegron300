package org.wecancoeit.reviews;

public class Review {
    private long id;
    private String title;
    private String imageUrl;
    private String category;
    private String content;
    private String releaseDate;

    public Review(long id, String title, String imageUrl, String category, String content, String releaseDate) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.category = category;
        this.content = content;
        this.releaseDate = releaseDate;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public String getContent() {
        return content;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
