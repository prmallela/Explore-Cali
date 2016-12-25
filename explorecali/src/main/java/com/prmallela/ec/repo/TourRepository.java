package com.prmallela.ec.repo;

import com.prmallela.ec.domin.Tour;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by param on 12/24/2016.
 */
public interface TourRepository extends CrudRepository<Tour,Integer> {
    List<Tour> findByTourPackageCode(String code);
}
