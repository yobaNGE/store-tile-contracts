package org.chiches.storecherepitsacontracs.viewmodel.catalogue;

public record CatalogueViewModel(
        List<TileViewModel> tiles,
        int currentPage,
        int totalPages,
        CatalogueFilterForm filter
) {}