package org.chiches.storecherepitsacontracs.viewmodel.catalogue;

import java.util.List;

public record CatalogueViewModel(
        List<TileViewModel> tiles,
        int currentPage,
        int totalPages
) {}