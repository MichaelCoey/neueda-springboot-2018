package uk.ac.belfastmet.dwarfssaved.repository;


import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.dwarfssaved.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {
	
	Iterable<Dwarf> findByAuthor(String author);

}
