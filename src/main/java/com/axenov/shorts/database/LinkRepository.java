package com.axenov.shorts.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends JpaRepository<LinkEntity, Long> {

    LinkEntity findTopByShortLink(String shortLink);
}
