package org.bmshackathon;

import org.springframework.data.repository.Repository;

import java.util.Optional;

//@RepositoryRestResource
public interface VideoMetadataRepository extends Repository<VideoMetadata, Long> {

    Optional<VideoMetadata> findOne(Long id);

    Iterable<VideoMetadata> findAll();
}
