package org.chiches.storecherepitsacontracs.viewmodel.home;

import org.chiches.storecherepitsacontracs.viewmodel.catalogue.TileViewModel;

import java.util.List;

public record HomePageViewModel(
        List<TileCategoryViewModel> popularCategories,
        List<TileViewModel> mostPurchasedTiles
) {}