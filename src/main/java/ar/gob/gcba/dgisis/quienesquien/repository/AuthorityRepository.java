package ar.gob.gcba.dgisis.quienesquien.repository;

import ar.gob.gcba.dgisis.quienesquien.domain.Authority;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Authority entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
