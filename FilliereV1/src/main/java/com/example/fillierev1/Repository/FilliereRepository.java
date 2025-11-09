package com.example.fillierev1.Repository;

import com.example.fillierev1.Entities.Filliere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilliereRepository extends JpaRepository<Filliere,Integer> {
}
