package org.chiches.storecherepitsacontracs.viewmodel.catalogue;


public record TileViewModel(
        Long id,
        String name,
        Long price,
        String material,
        String categoryName,
        String description
) {}