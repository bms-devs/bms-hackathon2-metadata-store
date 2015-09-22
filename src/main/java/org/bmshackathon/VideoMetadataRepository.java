package org.bmshackathon;

import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface VideoMetadataRepository extends Repository<VideoMetadata, Long> {

    Optional<VideoMetadata> findOne(Long uuid);
}
