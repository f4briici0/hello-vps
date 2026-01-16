package com.fabricio.helloVPS.repository;

import com.fabricio.helloVPS.entity.AttributesGoogle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributesRepository extends JpaRepository<AttributesGoogle, Long> {
}
