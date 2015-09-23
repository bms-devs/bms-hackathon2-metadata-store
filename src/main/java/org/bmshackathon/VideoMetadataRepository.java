package org.bmshackathon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface VideoMetadataRepository extends CrudRepository<VideoMetadata, Long> {

//    Optional<VideoMetadata> findOne(Long uuid);
}
