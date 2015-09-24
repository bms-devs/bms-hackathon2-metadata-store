package org.bmshackathon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class VideoMetadataController {

    private  VideoMetadataRepository videoMetadataRepository;

    @Autowired
    public VideoMetadataController(VideoMetadataRepository videoMetadataRepository) {
        this.videoMetadataRepository = videoMetadataRepository;
    }

    @RequestMapping(value = "/videos/{videoId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<VideoMetadata> findOne(@PathVariable Long videoId) {
        return videoMetadataRepository.findOne(videoId)
                .map(videoMetadata -> new ResponseEntity<>(videoMetadata, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @RequestMapping(value = "/videoMetadatas", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<Iterable<VideoMetadata>> findAll() {
        return new ResponseEntity<>(videoMetadataRepository.findAll(), OK);
    }

}
