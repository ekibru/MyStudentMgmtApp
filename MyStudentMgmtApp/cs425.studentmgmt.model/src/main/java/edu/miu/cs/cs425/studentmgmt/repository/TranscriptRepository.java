package edu.miu.cs.cs425.studentmgmt.repository;

import edu.miu.cs.cs425.studentmgmt.enitity.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranscriptRepository extends JpaRepository<Transcript,Long> {
}
