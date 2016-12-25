package com.prmallela.ec.service;

import com.prmallela.ec.domin.TourPackage;
import com.prmallela.ec.repo.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by param on 12/24/2016.
 */
@Service
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    public TourPackage createTourPackage(String code, String name) {
        if (tourPackageRepository.findOne(code) == null) {
            return tourPackageRepository.save(new TourPackage(code, name));
        } else {
            return null;
        }
    }
    public Iterable<TourPackage> lookup(){
        return tourPackageRepository.findAll();
    }
    public long total() {
        return tourPackageRepository.count();
    }
}

