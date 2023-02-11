package com.boc.gestionPoubelle.service;

import java.util.List;
import java.util.Optional;

public interface TypeDechet {
    Void createTypeDechet(TypeDechet typeDechet);
    Optional<TypeDechet> getTypeDechetById(int id);
    List<TypeDechet> getAllTypeDechet();
    Void delete(int id);
    Optional<TypeDechet> update(TypeDechet typeDechet);
}
