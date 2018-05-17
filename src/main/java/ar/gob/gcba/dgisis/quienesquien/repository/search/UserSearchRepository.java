package ar.gob.gcba.dgisis.quienesquien.repository.search;

import ar.gob.gcba.dgisis.quienesquien.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {
}
