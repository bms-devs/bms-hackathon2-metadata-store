package org.bmshackathon;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VideoMetadata {
    @Id
    private Long id;
    private Long uuid;
    private String title;
    private String description;

    public VideoMetadata() {
    }

    public VideoMetadata(Long id, Long uuid, String title, String description) {
        this.id = id;
        this.uuid = uuid;
        this.title = title;
        this.description = description;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
