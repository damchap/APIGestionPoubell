package com.boc.gestionPoubelle.service.impl;

import com.boc.gestionPoubelle.service.TypeDechet;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service("typeDechetService")
public class TypeDechetImpl implements TypeDechet {
    /**
     * @param typeDechet
     * @return
     */
    @Override
    public Void createTypeDechet(TypeDechet typeDechet) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<TypeDechet> getTypeDechetById(int id) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public List<TypeDechet> getAllTypeDechet() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Void delete(int id) {
        return null;
    }

    /**
     * @param typeDechet
     * @return
     */
    @Override
    public Optional<TypeDechet> update(TypeDechet typeDechet) {
        return Optional.empty();
    }
}
